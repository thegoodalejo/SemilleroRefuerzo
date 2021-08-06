package com.sophossolutions.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SwagLabsLogin
{
	public static final Target TXT_USER = Target.the("Campo de usuario").locatedBy("//input[@placeholder = 'Username']");
	public static final Target TXT_PASSWORD = Target.the("Campo de usuario").locatedBy("//input[@placeholder = 'Password']");
	public static final Target BTN_LOGIN = Target.the("Boton de inicio de sesion ").locatedBy("//input[@value='Login']");
}