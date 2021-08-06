package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.Cart;
import com.sophossolutions.ui.Checkout;
import com.sophossolutions.ui.Products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CheckoutTask implements Task
{
	private String strFistname;
	private String strLastName;
	private String strZipcode;
	
	public CheckoutTask(String strFistname, String strLastName, String strZipcode)
	{
		this.strFistname = strFistname;
		this.strLastName = strLastName;
		this.strZipcode = strZipcode;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Click.on(Cart.BTN_CHECKOUT),
			Enter.theValue(strFistname).into(Checkout.TXT_FIRSTNAME),
			Enter.theValue(strLastName).into(Checkout.TXT_LASTNAME),
			Enter.theValue(strZipcode).into(Checkout.TXT_ZIP),
			Click.on(Checkout.BTN_CONTINUE),
			Click.on(Checkout.BTN_FINISH)
		);
	}
	
	public static CheckoutTask withData(String strFistname, String strLastName, String strZipcode)
	{
		return instrumented(CheckoutTask.class, strFistname, strLastName,strZipcode);
	}
}