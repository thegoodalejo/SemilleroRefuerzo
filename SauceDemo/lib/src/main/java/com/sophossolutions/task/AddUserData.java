package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Map;

import com.sophossolutions.models.User;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sophossolutions.ui.UserPage.*;

public class AddUserData implements Task {
	
	private User userActual;
	
	public AddUserData(User userActual) {
		super();
		this.userActual = userActual;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Enter.theValue(userActual.getStrFirstName()).into(INPUT_FIRST_NAME),
				Enter.theValue(userActual.getStrLastName()).into(INPUT_LAST_NAME),
				Enter.theValue(userActual.getStrPostalCode()).into(INPUT_POSTAL_CODE),
				Click.on(INPUT_SUBMIT)
				);		
	}

	public static AddUserData with(DataTable dataUser) {
		Map<String, String> mapDataUser = dataUser.asMap(String.class, String.class);
		return instrumented(AddUserData.class, 
				new User(mapDataUser.get("firstName"),
						 mapDataUser.get("lastName"),
						 mapDataUser.get("codePostal"))
			);
	}
}
