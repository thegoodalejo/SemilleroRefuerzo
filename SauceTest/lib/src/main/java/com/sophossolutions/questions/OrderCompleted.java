package com.sophossolutions.questions;

import com.sophossolutions.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class OrderCompleted implements Question<String>{
		
	public OrderCompleted() {
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(CheckoutPage.TXT_ORDER_COMPLETED).viewedBy(actor).asString();
	}
	
	public static OrderCompleted message() {
		return new OrderCompleted();
	}
	
}
