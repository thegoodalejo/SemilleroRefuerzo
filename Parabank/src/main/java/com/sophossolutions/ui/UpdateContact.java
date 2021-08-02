package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UpdateContact
{
	public static final Target TXT_FIRST_NAME = Target.the("Fiel for first name").locatedBy("//input[@id='customer.firstName']");
	public static final Target TXT_LAST_NAME = Target.the("Fiel for last name").locatedBy("//input[@id='customer.lastName']");
	public static final Target TXT_ADDRESS = Target.the("Fiel for address").locatedBy("//input[@id='customer.address.street']");
	public static final Target TXT_CITY = Target.the("Fiel for city").locatedBy("//input[@id='customer.address.city']");
	public static final Target TXT_STATE = Target.the("Fiel for state").locatedBy("//input[@id='customer.address.state']");
	public static final Target TXT_ZIP = Target.the("Fiel for zip code").locatedBy("//input[@id='customer.address.zipCode']");
	public static final Target TXT_PHONE = Target.the("Fiel for phone number").locatedBy("//input[@id='customer.phoneNumber']");
	public static final Target BTN_UPDATE = Target.the("Button to update data").locatedBy("//input[@value='Update Profile']");
}