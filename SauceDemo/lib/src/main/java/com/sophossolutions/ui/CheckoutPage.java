package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
	public static final Target TEXT_PRICE = Target.the("Text of price product").locatedBy("//div[@class='summary_subtotal_label']");
	public static final Target TEXT_TOTAL_PRICE = Target.the("Text of total price").locatedBy("//div[@class='summary_subtotal_label']");
	public static final Target BUTTON_FINISH = Target.the("Button end shopp").locatedBy("//button[@id='finish']");
}
