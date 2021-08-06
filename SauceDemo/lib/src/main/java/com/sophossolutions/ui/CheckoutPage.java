package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
	public static final Target TEXT_PRICE = Target.the("Text of price product").locatedBy("//div[div[text()='{0}'][@class='inventory_item_price'] ]");
	public static final Target BUTTON_FINISH = Target.the("Button end shopp").locatedBy("//button[@id='finish']");
}
