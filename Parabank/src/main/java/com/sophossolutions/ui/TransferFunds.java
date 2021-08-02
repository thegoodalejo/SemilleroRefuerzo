package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TransferFunds
{
	public static final Target TXT_AMOUNT = Target.the("Fiel for aumount").locatedBy("//input[@id='amount']");
	public static final Target FROM_ACCOUNT_OPTIONS = Target.the("Accounts ptions").locatedBy("//select[@id='fromAccountId']");
	public static final Target TO_ACCOUNT_OPTIONS = Target.the("Fiel for aumount").locatedBy("//select[@id='toAccountId']");
	public static final Target BTN_TRANSFER = Target.the("Button for transfer").locatedBy("//input[@value='Transfer']");
}