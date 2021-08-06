package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.sophossolutions.models.Product;
import com.sophossolutions.task.AddItemToCart;
import com.sophossolutions.task.ProductList;
import com.sophossolutions.task.AvailableProducts;

import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.constants.Constants.PRODUCTS_PURCHASED;
import static com.sophossolutions.ui.CartPage.BUTTON_REMOVE_ITEM;
import static com.sophossolutions.ui.CartPage.BUTTON_CHECKOUT;
import static com.sophossolutions.ui.ProductsPage.ITEM_LIST_CHECK;
import static com.sophossolutions.ui.ProductsPage.ICON_CART;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCartStepDefinitions { 
	
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@Given("I am on the product list")
	public void iAmOnTheProductList() {
	    theActorCalled(ACTOR_NAME).should(seeThat(the(ITEM_LIST_CHECK), isVisible()));
	    theActorInTheSpotlight().wasAbleTo(AvailableProducts.get());
	}

	@When("I select the most expensive item")
	public void iSelectTheMostExpensiveItem() {
		theActorInTheSpotlight().wasAbleTo(AddItemToCart.expensive());
	}

	@When("I select the cheapest item")
	public void iSelectTheCheapestItem() {
		theActorInTheSpotlight().wasAbleTo(AddItemToCart.cheapest());
		theActorInTheSpotlight().wasAbleTo(Click.on(ICON_CART));
	}
	
	@Then("I verify that it is in the cart")
	public void iVerifyThatItIsInTheCart() {
		List<Product> listPurchased = theActorInTheSpotlight().recall(PRODUCTS_PURCHASED);
		for (Product product : listPurchased) {
			theActorInTheSpotlight().should(seeThat(the(BUTTON_REMOVE_ITEM.of(product.getStrPrice().toString())), isVisible()));
		}
	}
	
}
