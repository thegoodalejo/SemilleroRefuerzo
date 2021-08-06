package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UserPage {
	public static final Target INPUT_FIRST_NAME = Target.the("Input of first name").locatedBy("//input[@id='first-name']");
	public static final Target INPUT_LAST_NAME = Target.the("Input of last name").locatedBy("//input[@id='last-name']");
	public static final Target INPUT_POSTAL_CODE = Target.the("Input of Postal code").locatedBy("//input[@id='postal-code']");
	public static final Target INPUT_SUBMIT = Target.the("Input of submit data").locatedBy("//input[@id='continue']");
}
