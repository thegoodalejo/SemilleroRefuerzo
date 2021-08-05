package com.sophossolutions.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.sophossolutions.models.Product;
import com.sophossolutions.ui.CartPage;
import com.sophossolutions.ui.ProductsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class CheckCart implements Question<Boolean>{
		
	public CheckCart() {
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		actor.attemptsTo(Click.on(ProductsPage.BTN_CART));
		List<WebElementFacade> listItems = CartPage.CART_LIST.resolveAllFor(actor);
		
		Map<String, Object> itemsActor = actor.recallAll();		
		Map<String, Product> itemsCart = new HashMap<String, Product>();
		
		for (int i = 1; i <= listItems.size(); i++) {
			
			String title = CartPage.TXT_NAME_PRODUCT.of(i+"").resolveFor(actor).getText();					
			String description = CartPage.TXT_DESCRIPTION_PRODUCT.of(i+"").resolveFor(actor).getText();
			String price = CartPage.TXT_PRICE_PRODUCT.of(i+"").resolveFor(actor).getText();			
			
			Product p = new Product(title, description, price);			
			itemsCart.put(p.getName(), p);
		}
		
		
		//Verificar		
		for (Map.Entry<String, Object> entry : itemsActor.entrySet()) {
			Product pActor = (Product) entry.getValue();
			
			if(!itemsCart.containsKey(pActor.getName())) 
				return false;
			
			Product pCart = itemsCart.get(pActor.getName());
						
			if(!pCart.getDescription().equals(pActor.getDescription()))
				return false;
			if(!pCart.getPrice().equals(pActor.getPrice()))
				return false;
			
	    }
		
		return true;
	}
	
	public static CheckCart run() {
		return new CheckCart();
	}
	
}
