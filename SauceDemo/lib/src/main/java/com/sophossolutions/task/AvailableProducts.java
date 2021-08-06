package com.sophossolutions.task;

import static com.sophossolutions.ui.ProductsPage.ITEM_DESCRIPTION_LIST;
import static com.sophossolutions.ui.ProductsPage.ITEM_NAME_LIST;
import static com.sophossolutions.ui.ProductsPage.ITEM_PRICE_LIST;
import static com.sophossolutions.utils.Utils.getTextOfElements;
import static com.sophossolutions.utils.Utils.getProductMaxPrice;
import static com.sophossolutions.utils.Utils.getProductMinPrice;

import java.util.ArrayList;
import java.util.List;

import com.sophossolutions.models.Product;
import static com.sophossolutions.constants.Constants.ALL_PRODUCTS;
import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;
import static com.sophossolutions.constants.Constants.PRODUCTS_PURCHASED;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AvailableProducts implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<String> listNames = getTextOfElements(ITEM_NAME_LIST, actor);
		List<String> listDescriptions = getTextOfElements(ITEM_DESCRIPTION_LIST, actor);
		List<String> listPrice = getTextOfElements(ITEM_PRICE_LIST, actor);
		List<Product> listProducts = new ArrayList<Product>();
		try {
			for (int i = 0; i < listNames.size(); i++) {
				listProducts.add(new Product(
						listNames.get(i),
						listDescriptions.get(i),
						Double.parseDouble( listPrice.get(i).replace("$", "") )
						));
			}
			actor.remember(ALL_PRODUCTS, listProducts);
			actor.remember(PRODUCTS_PURCHASED, new ArrayList<Product>());
			actor.remember(CHEAPEST_KEY,  getProductMinPrice(listProducts));
			actor.remember(EXPENSIVE_KEY, getProductMaxPrice(listProducts));
		} catch (Exception e) {
			System.err.println("Size of lists not consistents");
			
		}
	}

	public static AvailableProducts get() {
		return instrumented(AvailableProducts.class);
	}

}
