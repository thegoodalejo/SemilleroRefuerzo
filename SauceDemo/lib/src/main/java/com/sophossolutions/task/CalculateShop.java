package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.sophossolutions.constants.Constants.PRODUCTS_PURCHASED;
import static com.sophossolutions.constants.Constants.TOTAL_PRICE_KEY;
import static com.sophossolutions.utils.Utils.calculatePrice;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalculateShop implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.remember(TOTAL_PRICE_KEY, calculatePrice(actor.recall(PRODUCTS_PURCHASED)));
	}

	public static CalculateShop now() {
		return instrumented(CalculateShop.class);
	}

}
