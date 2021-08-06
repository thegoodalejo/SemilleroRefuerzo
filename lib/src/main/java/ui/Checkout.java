package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Checkout {
	public static final Target TXT_FIRSTNAME = Target.the("").located(By.id("first-name"));
	public static final Target TXT_LASTNAME = Target.the("").located(By.id("last-name"));
	public static final Target TXT_ZIPCODE = Target.the("").located(By.id("postal-code"));
	public static final Target BTN_CONTINUE = Target.the("").located(By.name("continue"));

}
