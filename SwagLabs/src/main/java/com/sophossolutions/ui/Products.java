package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class Products
{
	public static final Target TXT_TITLE = Target.the("Page title").locatedBy("//span[text()='Products']");
	public static final Target ORDER_OPTIONS = Target.the("Order products options").locatedBy("//select[@class='product_sort_container']");
	public static final Target TXT_NAME = Target.the("Product name").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']");
	public static final Target TXT_PRICE = Target.the("Product price").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_price']");
	public static final Target BTN_ADD = Target.the("Add to cart button").locatedBy("//div[@class='inventory_item'][1]//button");
	public static final Target BTN_CART = Target.the("Cart button").locatedBy("//a[@class='shopping_cart_link']");
}