package com.sophossolutions.questions;

import com.sophossolutions.models.Product;
import com.sophossolutions.ui.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductInfo implements Question<Product>{
		
	public ProductInfo() {
	}

	@Override
	public Product answeredBy(Actor actor) {
		String nameProduct = Text.of(ProductsPage.TXT_NAME_PRODUCT).viewedBy(actor).asString();
		String descriptionProduct = Text.of(ProductsPage.TXT_DESCRIPTION_PRODUCT).viewedBy(actor).asString();
		String priceProduct = Text.of(ProductsPage.TXT_PRICE_PRODUCT).viewedBy(actor).asString();
		
		Product p = new Product(nameProduct, descriptionProduct, priceProduct);
		
		return p;
	}
	
	public static ProductInfo view() {		
		return new ProductInfo();
	}
	
}
