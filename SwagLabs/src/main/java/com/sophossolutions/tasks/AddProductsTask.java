package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.PRODUCT1;
import static com.sophossolutions.util.Constants.PRODUCT2;
import static com.sophossolutions.util.Constants.PRODUCT_CART1;
import static com.sophossolutions.util.Constants.PRODUCT_CART2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.interactions.Remember;
import com.sophossolutions.ui.Cart;
import com.sophossolutions.ui.Products;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AddProductsTask implements Task
{
	public AddProductsTask()
	{}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(SelectFromOptions.byIndex(2).from(Products.ORDER_OPTIONS),
			Remember.product(PRODUCT1, Products.TXT_NAME, Products.TXT_PRICE),
			Click.on(Products.BTN_ADD),
			SelectFromOptions.byIndex(3).from(Products.ORDER_OPTIONS),
			Remember.product(PRODUCT2, Products.TXT_NAME, Products.TXT_PRICE),
			Click.on(Products.BTN_ADD),
			Click.on(Products.BTN_CART),
			Remember.product(PRODUCT_CART1, Cart.TXT_NAME.of("" + 1), Cart.TXT_PRICE.of("" + 1)),
			Remember.product(PRODUCT_CART2, Cart.TXT_NAME.of("" + 2), Cart.TXT_PRICE.of("" + 2))
		);
	}
	
	public static AddProductsTask toCart()
	{
		return instrumented(AddProductsTask.class);
	}
}