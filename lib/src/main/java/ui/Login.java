package ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Login {
	public static final Target TXT_USER = Target.the("User field").located(By.name("user-name"));	
	public static final Target TXT_PASS = Target.the("Password field").located(By.name("password"));
	public static final Target BTN_LOGIN = Target.the("Button Login").located(By.name("login-button"));
	public static final Target TXT_PRODUCTS = Target.the("Products text").located(By.className("title"));

}
