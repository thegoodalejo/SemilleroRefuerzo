package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	public static final Target BUTTON_REMOVE_ITEM = Target.the("Button of the item to shop").locatedBy("//div[div[text()='{0}'] ]//button");
	public static final Target BUTTON_CHECKOUT = Target.the("Button to checkout shop").locatedBy("//button[@id='checkout']");
}
