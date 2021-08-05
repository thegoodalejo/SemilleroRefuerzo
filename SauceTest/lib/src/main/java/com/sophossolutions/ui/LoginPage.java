package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target TXT_USER_NAME= Target.the("Campo nombre de usuario").locatedBy("//input[@id='user-name']");
	public static final Target TXT_PASSWORD=Target.the("Campo contraseña").located(By.id("password"));
	public static final Target BTN_LOGIN=Target.the("Boton login").locatedBy("//input[@id='login-button']");	

}
