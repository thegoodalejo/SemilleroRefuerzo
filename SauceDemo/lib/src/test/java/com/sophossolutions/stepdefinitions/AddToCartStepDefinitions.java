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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.sophossolutions.task.AddItemToCart;
import com.sophossolutions.task.ProductList;

import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;
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
	}

	@When("I select the most expensive item")
	public void iSelectTheMostExpensiveItem() {
		theActorInTheSpotlight().wasAbleTo(ProductList.searchMax());
		theActorInTheSpotlight().wasAbleTo(AddItemToCart.expensive());
	}

	@When("I select the cheapest item")
	public void iSelectTheCheapestItem() {
		theActorInTheSpotlight().wasAbleTo(ProductList.searchMin());
		theActorInTheSpotlight().wasAbleTo(AddItemToCart.cheapest());
		theActorInTheSpotlight().wasAbleTo(Click.on(ICON_CART));
	}

	@Then("I verify that it is in the cart")
	public void iVerifyThatItIsInTheCart() {
		Target expensiveItem = BUTTON_REMOVE_ITEM.of(theActorInTheSpotlight().recall(EXPENSIVE_KEY).toString());
		Target cheapestItem  = BUTTON_REMOVE_ITEM.of(theActorInTheSpotlight().recall(CHEAPEST_KEY ).toString());
	    theActorInTheSpotlight().should(seeThat(the(expensiveItem), isVisible()));
	    theActorInTheSpotlight().should(seeThat(the(cheapestItem), isVisible()));
	    theActorInTheSpotlight().wasAbleTo(Click.on(BUTTON_CHECKOUT));
	}
	
}
