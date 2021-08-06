package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Cart
{
	public static final Target TXT_NAME = Target.the("Product name").locatedBy("//div[@class='cart_item'][{0}]//div[@class='inventory_item_name']");
	public static final Target TXT_PRICE = Target.the("Product price").locatedBy("//div[@class='cart_item'][{0}]//div[@class='inventory_item_price']");
	public static final Target BTN_CHECKOUT = Target.the("Checkout boton").locatedBy("//button[@name = 'checkout']");
}