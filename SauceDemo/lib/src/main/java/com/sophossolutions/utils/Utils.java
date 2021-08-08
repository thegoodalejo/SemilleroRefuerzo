package com.sophossolutions.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sophossolutions.models.Product;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;


public class Utils {
	
	public static List<String> getTextOfElements(Target itemList, Actor actor){
		List<String> textElements = new ArrayList<String>();
		for (WebElementFacade element : itemList.resolveAllFor(actor)) {
			textElements.add(element.getText());
		}
		return textElements;
	}
	
	public static List<Double> getNumbers(List<String> itemList){
		List<Double> numbersElements = new ArrayList<Double>();
		for (String item : itemList) {
			numbersElements.add(Double.parseDouble(item.replace("$", "")));
		}
		Collections.sort(numbersElements);
		return numbersElements;
	}
	
	public static Product getProductMaxPrice(List<Product> listProduct) {
		int indexMax = 0;
		Double maxPrice = 0.0;
		for (int i = 0; i < listProduct.size(); i++) {
			Double currentPrice = listProduct.get(i).getDblPrice();
			if ( currentPrice > maxPrice) {
				indexMax = i;
				maxPrice = currentPrice;
			}
		}
		return listProduct.get(indexMax);
	}
	
	public static Product getProductMinPrice(List<Product> listProduct) {
		int indexMin = 0;
		Double minPrice = listProduct.get(indexMin).getDblPrice();;
		for (int i = 0; i < listProduct.size(); i++) {
			Double currentPrice = listProduct.get(i).getDblPrice();
			if ( currentPrice < minPrice) {
				indexMin = i;
				minPrice = currentPrice;
			}
		}
		return listProduct.get(indexMin);
	}
	public static Double calculatePrice(List<Product> listProducts) {
		Double priceTotal = 0.0;
		for (Product product : listProducts) {
			priceTotal += product.getDblPrice();
		}
		return priceTotal;
	}
}
