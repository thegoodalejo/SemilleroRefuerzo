package com.sophossolutions.interactions;

import static com.sophossolutions.util.Constants.CREATE;
import static com.sophossolutions.util.Constants.NUMBER_ACOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.ui.AccountOverview;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class RememberNewtAccount implements Interaction
{
	public RememberNewtAccount()
	{}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		String newAccount = actor.recall(NUMBER_ACOUNT);
		Target numberAccount = null;
		String strNumberAccount = null;
		for(int i = 1;i <= 100; i++)
		{
			numberAccount = AccountOverview.numberAccount(i);
			strNumberAccount = numberAccount.resolveFor(theActorInTheSpotlight()).getTextValue();
			if(strNumberAccount.equals(newAccount))
			{
				i = 101;
			}
		}
		actor.remember(CREATE, strNumberAccount);
	}
	
	public static RememberNewtAccount newAccount()
	{
		return instrumented(RememberNewtAccount.class);
	}
}