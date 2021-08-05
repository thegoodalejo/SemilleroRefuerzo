package com.sophossolutions.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	public static final Target CART_LIST = Target.the("Lista items en carrito").locatedBy("//div[@class='cart_item_label']");
	public static final Target TXT_NAME_PRODUCT = Target.the("Nombre del producto").locatedBy("//div[@class='cart_item'][{0}]//div[@class='inventory_item_name']");
	public static final Target TXT_DESCRIPTION_PRODUCT = Target.the("Descripcion del producto").locatedBy("//div[@class='cart_item'][{0}]//div[@class='inventory_item_desc']");
	public static final Target TXT_PRICE_PRODUCT = Target.the("Precio del producto").locatedBy("//div[@class='cart_item'][{0}]//div[@class='inventory_item_price']");	
	public static final Target BTN_CHECKOUT = Target.the("Boton checkout").located(By.id("checkout"));	
	

}
