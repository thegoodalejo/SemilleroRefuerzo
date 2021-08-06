package com.sophossolutions.questions;

import static com.sophossolutions.util.Constants.PRODUCT1;
import static com.sophossolutions.util.Constants.PRODUCT2;
import static com.sophossolutions.util.Constants.PRODUCT_CART1;
import static com.sophossolutions.util.Constants.PRODUCT_CART2;
import com.sophossolutions.models.Product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AddProducts implements Question<Boolean>
{
	public AddProducts()
	{}
	
	@Override
	public Boolean answeredBy(Actor actor)
	{
		Product product1 = (Product)actor.recall(PRODUCT1);
		Product product2 = (Product)actor.recall(PRODUCT2);
		Product productInCart1 = (Product)actor.recall(PRODUCT_CART1);
		Product productInCart2 = (Product)actor.recall(PRODUCT_CART2);
		
		if(product1.isEqueals(productInCart1) && product2.isEqueals(productInCart2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static AddProducts existToCart()
	{
		return new AddProducts();
	}
}