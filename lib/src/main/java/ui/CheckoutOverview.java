package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverview {
	public static final Target PRODUCT_1 = Target.the("Product name").locatedBy("//div[@class='cart_item'][1]//div[@class='inventory_item_name']");
	public static final Target PRODUCT_2 = Target.the("Product name").locatedBy("//div[@class='cart_item'][2]//div[@class='inventory_item_name']");
	public static final Target BTN_FINISH = Target.the("Button Finish").located(By.id("finish"));
}
