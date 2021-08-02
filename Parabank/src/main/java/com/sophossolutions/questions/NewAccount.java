package com.sophossolutions.questions;

import static com.sophossolutions.util.Constants.CREATE;

import com.sophossolutions.interactions.RememberNewtAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NewAccount implements Question<Boolean>
{
	public NewAccount()
	{}

	@Override
	public Boolean answeredBy(Actor actor)
	{
		actor.attemptsTo(RememberNewtAccount.newAccount());
		String account = actor.recall(CREATE);
		if(account != null)
		{
			return true;
		}
		return false;
	}
	
	public static NewAccount wasCreateTheAccount()
	{
		return new NewAccount();
	}
}