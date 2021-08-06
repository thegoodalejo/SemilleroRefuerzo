package com.sophossolutions.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
	
}
