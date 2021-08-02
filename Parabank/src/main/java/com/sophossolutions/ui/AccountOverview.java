package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AccountOverview
{
	public static Target numberAccount(int index)
	{
		Target acount = Target.the("Number account on table").locatedBy("//*[@id=\"accountTable\"]//tbody//tr[" + (index + 1) + "]//td[1]//a");
		return acount;
	}
	
	public static Target balanceAccount(int index)
	{
		Target balance = Target.the("Balance account on table").locatedBy("//*[@id='accountTable']//tbody//tr[" + (index + 1) + "]//td[2]");
		return balance;
	}
}