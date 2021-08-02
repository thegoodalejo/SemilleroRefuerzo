package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.FROM_ACCOUNT;
import static com.sophossolutions.util.Constants.LIST;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ParabankPanel;
import com.sophossolutions.ui.TransferFunds;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class TransferFundTask implements Task
{
	private String strAmount;
	private int intFromAccount;
	private int intToAccount;
	
	public TransferFundTask(int intAmount, int intFromAccount, int intToAccount)
	{
		this.strAmount = "" + intAmount;
		this.intFromAccount = intFromAccount;
		this.intToAccount = intToAccount;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Enter.theValue(strAmount).into(TransferFunds.TXT_AMOUNT),
			SelectFromOptions.byIndex(intFromAccount - 1).from(TransferFunds.FROM_ACCOUNT_OPTIONS),
			SelectFromOptions.byIndex(intToAccount - 1).from(TransferFunds.TO_ACCOUNT_OPTIONS),
			Click.on(TransferFunds.BTN_TRANSFER),
			Click.on(ParabankPanel.getSection(LIST)));
		actor.remember(FROM_ACCOUNT, intFromAccount);
	}
	
	public static TransferFundTask fromAAccountToTheOther(int intAmount, int intFromAccount, int intToAccount)
	{
		return instrumented(TransferFundTask.class, intAmount, intFromAccount, intToAccount);
	}
}