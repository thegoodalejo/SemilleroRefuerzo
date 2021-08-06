package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
	public static final Target ICON_CART = Target.the("Link of cart").locatedBy("//a[@class='shopping_cart_link']");
	public static final Target ITEM_PRICE_LIST = Target.the("item Price list").locatedBy("//div[@class='inventory_item_price']");
	public static final Target ITEM_LIST_CHECK = Target.the("item list to check").locatedBy("//div[@class='inventory_list'][count(div[@class='inventory_item']) >= 1]");
	public static final Target BUTTON_ITEM = Target.the("Button of the item to shop").locatedBy("//div[div[text()='{0}'] ]//button");
	
	public static final Target ITEM_NAME_LIST = Target.the("item Name list").locatedBy("//div[@class='inventory_item_name']");
	public static final Target ITEM_DESCRIPTION_LIST = Target.the("item Description list").locatedBy("//div[@class='inventory_item_name']");
}
