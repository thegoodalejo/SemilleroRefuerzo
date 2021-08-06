package com.sophossolutions.questions;

import com.sophossolutions.ui.Checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CheckoutQuestion implements Question<Boolean>
{
	private String strText;
	
	public CheckoutQuestion(String strText)
	{
		this.strText = strText;
	}
	
	@Override
	public Boolean answeredBy(Actor actor)
	{
		String strText = Text.of(Checkout.TXT_OK).viewedBy(actor).asString();
		if(this.strText.equals(strText))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static CheckoutQuestion finishedOK(String strText)
	{
		return new CheckoutQuestion(strText);
	}
}