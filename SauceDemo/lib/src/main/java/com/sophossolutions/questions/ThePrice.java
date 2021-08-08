package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ThePrice implements Question<String> {
	
	private Target targetText;
	
	public ThePrice(Target targetText) {
		this.targetText = targetText;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(targetText).viewedBy(actor).asString();
	}

	public static ThePrice seen(Target tarTotalPrice) {
		// TODO Auto-generated method stub
		return new ThePrice(tarTotalPrice);
	}
	
}
