package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {
	public static final Target INPUT_USERNAME = Target.the("Input text of username").locatedBy("//input[@id='user-name']");
	public static final Target INPUT_PASSWORD = Target.the("Input text of password").locatedBy("//input[@id='password']");
	public static final Target SUBMMIT_DATA = Target.the("Input submit of user-data").locatedBy("//input[@id='login-button']");
}
