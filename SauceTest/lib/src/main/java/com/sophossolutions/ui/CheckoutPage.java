package com.sophossolutions.ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {	
	public static final Target BTN_CONTINUE = Target.the("Boton continue").located(By.id("continue"));
	public static final Target BTN_FINISH = Target.the("Boton finish").located(By.id("finish"));
	public static final Target INPUT_FIRST_NAME = Target.the("Campo first name").located(By.id("first-name"));
	public static final Target INPUT_LAST_NAME = Target.the("Campo last name").located(By.id("last-name"));
	public static final Target INPUT_POSTAL_CODE = Target.the("Campo postal code").located(By.id("postal-code"));
	public static final Target TXT_ORDER_COMPLETED = Target.the("Texto final compra").located(By.xpath("//div[@id='checkout_complete_container']//h2"));	

}
