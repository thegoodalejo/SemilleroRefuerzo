package com.sophossolutions.tasks;

import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {

	private String firstName;
	private String lastName;
	private String postalCode;	
	
	public Checkout(String firstName, String lastName, String postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(CartPage.BTN_CHECKOUT),
				Enter.theValue(firstName).into(CheckoutPage.INPUT_FIRST_NAME),
				Enter.theValue(lastName).into(CheckoutPage.INPUT_LAST_NAME),
				Enter.theValue(postalCode).into(CheckoutPage.INPUT_POSTAL_CODE),
				Click.on(CheckoutPage.BTN_CONTINUE),
				Click.on(CheckoutPage.BTN_FINISH)				
				);
				
	}

	public static Checkout with(String firstName, String lastName, String postalCode) {
		return instrumented(Checkout.class, firstName, lastName, postalCode);		
	}
	

}