package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.LIST;
import static com.sophossolutions.util.Constants.NUMBER_ACOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.NewAccount;
import com.sophossolutions.ui.ParabankPanel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class NewAccountTask implements Task
{
	private String strTypeAcount;
	private int intAccount;
	
	public NewAccountTask(int intAccount, String strTypeAcount)
	{
		this.intAccount = intAccount;
		this.strTypeAcount = strTypeAcount;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(SelectFromOptions.byVisibleText(strTypeAcount).from(NewAccount.TYPE_ACOUNT_OPTIONS),
			SelectFromOptions.byIndex(intAccount - 1).from(NewAccount.NUMBER_ACOUNT_OPTIONS),
			Click.on(NewAccount.BTN_NEW_ACOUNT));
		actor.remember(NUMBER_ACOUNT, Text.of(NewAccount.LINK_NEW_ACOUNT).viewedBy(actor).asString());
		actor.attemptsTo(Click.on(ParabankPanel.getSection(LIST)));
	}
	
	public static NewAccountTask withType(int intAccount, String strTypeAcount)
	{
		return instrumented(NewAccountTask.class, intAccount, strTypeAcount);
	}
}