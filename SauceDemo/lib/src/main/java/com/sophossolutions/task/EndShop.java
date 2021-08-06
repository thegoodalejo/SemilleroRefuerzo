package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.models.User;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sophossolutions.ui.UserPage.*;

public class EndShop implements Task {
	
	private User userActual = new User();
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Enter.theValue(userActual.getStrFirstName()).into(INPUT_FIRST_NAME),
				Enter.theValue(userActual.getStrLastName()).into(INPUT_LAST_NAME),
				Enter.theValue(userActual.getStrPostalCode()).into(INPUT_POSTAL_CODE),
				Click.on(INPUT_SUBMIT)
				);		
	}

	public static EndShop with() {
		// TODO Auto-generated method stub
		return instrumented(EndShop.class);
	}

}
