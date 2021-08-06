package com.sophossolutions.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;
import static com.sophossolutions.ui.ProductsPage.ITEM_PRICE_LIST;
import static  com.sophossolutions.utils.Utils.getTextOfElements;
import static  com.sophossolutions.utils.Utils.getNumbers;

public class ProductList implements Task {
	
	private int intIndex = 0;
	private String strKey;
	
	public ProductList(String strKey) {
		super();
		this.strKey = strKey;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<String> listProbe = getTextOfElements(ITEM_PRICE_LIST, actor);
		List<Double> listPrices = getNumbers(listProbe);
		if(strKey.equals(EXPENSIVE_KEY))intIndex = listPrices.size() - 1;
		String strElement = listPrices.get(intIndex).toString();
		System.out.println("The " + strKey + " item is: " + strElement);
		actor.remember(strKey, strElement);
	}

	public static ProductList searchMax() {
		return instrumented(ProductList.class, EXPENSIVE_KEY);
	}
	
	public static ProductList searchMin() {
		return instrumented(ProductList.class, CHEAPEST_KEY);
	}

}
