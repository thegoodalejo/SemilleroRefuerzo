package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Checkout
{
	public static final Target TXT_FIRSTNAME = Target.the("First name field").locatedBy("//input[@name='firstName']");
	public static final Target TXT_LASTNAME = Target.the("Last name field").locatedBy("//input[@name='lastName']");
	public static final Target TXT_ZIP = Target.the("Zip code field").locatedBy("//input[@name='postalCode']");
	public static final Target BTN_CONTINUE = Target.the("Cotinue button").locatedBy("//input[@name='continue']");
	public static final Target BTN_FINISH = Target.the("Finish button").locatedBy("//button[@name='finish']");
	public static final Target TXT_OK = Target.the("OK text").locatedBy("//h2[@class='complete-header']");
}