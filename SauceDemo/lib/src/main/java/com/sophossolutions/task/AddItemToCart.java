package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.sophossolutions.models.Product;

import static com.sophossolutions.ui.ProductsPage.BUTTON_ITEM;
import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;
import static com.sophossolutions.constants.Constants.PRODUCTS_PURCHASED;

public class AddItemToCart implements Task {
	
	private String strKeyItem;

	public AddItemToCart(String strKeyItem) {
		super();
		this.strKeyItem = strKeyItem;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Product currentProduct = actor.recall(strKeyItem);
		List<Product> listPurchased =actor.recall(PRODUCTS_PURCHASED);
		listPurchased.add(currentProduct);
		actor.remember(PRODUCTS_PURCHASED, listPurchased);
		actor.wasAbleTo(
				Click.on(BUTTON_ITEM.of(currentProduct.getStrPrice().toString()))
		);
		System.out.println("The element " + strKeyItem + " is:");
		currentProduct.showProduct();
	}
	
	public static AddItemToCart expensive() {
		return instrumented(AddItemToCart.class, EXPENSIVE_KEY);
	}
	
	public static AddItemToCart cheapest() {
		return instrumented(AddItemToCart.class, CHEAPEST_KEY);
	}

}
