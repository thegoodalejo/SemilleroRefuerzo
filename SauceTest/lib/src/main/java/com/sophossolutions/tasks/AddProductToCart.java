package com.sophossolutions.tasks;

import com.sophossolutions.models.Product;
import com.sophossolutions.questions.ProductInfo;
import com.sophossolutions.ui.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {

	private String valueOpion;

	public AddProductToCart(String valueOpion) {
		this.valueOpion = valueOpion;
	}	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				SelectFromOptions.byValue(valueOpion).from(ProductsPage.SEL_FILTER),
				Click.on(ProductsPage.BTN_ADD_TO_CART)				
				);		
		
		Product p = ProductInfo.view().answeredBy(actor);
		actor.remember(p.getName(), p);
		
	}

	public static AddProductToCart withHigherPrice() {
		return instrumented(AddProductToCart.class, "hilo");		
	}
	
	public static AddProductToCart withLowerPrice() {
		return instrumented(AddProductToCart.class, "lohi");		
	}

}