package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsView {
	public static final Target LIST_FILTERS = Target.the("Filters").located(By.className("product_sort_container"));
	public static final Target TXT_PRODUCT_NAME1 = Target.the("Product name").locatedBy("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']");
	public static final Target TXT_PRODUCT_NAME2 = Target.the("Product name").locatedBy("//div[@class='inventory_item'][6]//div[@class='inventory_item_name']");
	public static final Target BTN_ADD_CAR = Target.the("Button add to car").locatedBy("//div[@class='inventory_item'][1]//button");
	public static final Target BTN_CAR = Target.the("Filters").located(By.className("shopping_cart_link"));
}
