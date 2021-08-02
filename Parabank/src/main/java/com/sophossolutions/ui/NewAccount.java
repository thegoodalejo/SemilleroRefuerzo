package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewAccount
{
	public static final Target TYPE_ACOUNT_OPTIONS = Target.the("Tipo de cuenta").locatedBy("//select[@id='type']");
	public static final Target NUMBER_ACOUNT_OPTIONS = Target.the("Numero de cuenta").locatedBy("//select[@id='fromAccountId']");
	public static final Target BTN_NEW_ACOUNT = Target.the("Campo de usuario").locatedBy("//*[@id='rightPanel']//div//div//form//div//input");
	public static final Target LINK_NEW_ACOUNT = Target.the("Campo de usuario").locatedBy("//*[@id='newAccountId']");
}