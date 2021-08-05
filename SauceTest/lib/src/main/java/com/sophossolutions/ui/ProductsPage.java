package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
	public static final Target SEL_FILTER = Target.the("Campo nombre de usuario").locatedBy("//select[@class='product_sort_container']");
	public static final Target TXT_NAME_PRODUCT = Target.the("Nombre del producto").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']");
	public static final Target TXT_DESCRIPTION_PRODUCT = Target.the("Descripcion del producto").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_desc']");
	public static final Target TXT_PRICE_PRODUCT = Target.the("Precio del producto").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_price']");
	public static final Target BTN_ADD_TO_CART = Target.the("Botón Add to cart").locatedBy("//div[@class='inventory_item'][1]//button");
	public static final Target BTN_CART = Target.the("Botón go cart").locatedBy("//a[@class='shopping_cart_link']");
	public static final Target TXT_TITLE = Target.the("Titulo de pagina").locatedBy("//span[text()='Products']");
	
}
