package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static com.sophossolutions.ui.ProductsPage.BUTTON_ITEM;
import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;

public class AddItemToCart implements Task {
	
	private String strKeyItem;

	public AddItemToCart(String strKeyItem) {
		super();
		this.strKeyItem = strKeyItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Click.on(BUTTON_ITEM.of(actor.recall(strKeyItem).toString()))
		);
		
	}
	
	public static AddItemToCart expensive() {
		return instrumented(AddItemToCart.class, EXPENSIVE_KEY);
	}
	
	public static AddItemToCart cheapest() {
		return instrumented(AddItemToCart.class, CHEAPEST_KEY);
	}

}
