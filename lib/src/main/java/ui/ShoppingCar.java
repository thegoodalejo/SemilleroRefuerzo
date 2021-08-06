package ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCar {
	public static final Target BTN_CHECKOUT = Target.the("Button Checkout").located(By.name("checkout"));

}
