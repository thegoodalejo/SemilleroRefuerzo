package com.sophossolutions.task;

import static com.sophossolutions.ui.HomePage.INPUT_USERNAME;
import static com.sophossolutions.ui.HomePage.INPUT_PASSWORD;
import static com.sophossolutions.ui.HomePage.SUBMMIT_DATA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {
	
	private String strUser;
	private String strPassword;
	
	public LoginUser(String strUser, String strPassword) {
		super();
		this.strUser = strUser;
		this.strPassword = strPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Enter.theValue(strUser).into(INPUT_USERNAME),
				Enter.theValue(strPassword).into(INPUT_PASSWORD),
				Click.on(SUBMMIT_DATA)
				);
	}

	public static LoginUser with(String strUser, String strPass) {
		return instrumented(LoginUser.class, strUser, strPass);
	}

}
