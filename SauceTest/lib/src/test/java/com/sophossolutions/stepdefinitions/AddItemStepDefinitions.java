package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.questions.CheckCart;
import com.sophossolutions.tasks.AddProductToCart;
import com.sophossolutions.exceptions.Exception;


public class AddItemStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}		
	
	@When("Add items")
	public void addItems() throws InterruptedException {
		theActorInTheSpotlight().wasAbleTo(AddProductToCart.withHigherPrice());
		theActorInTheSpotlight().wasAbleTo(AddProductToCart.withLowerPrice());
	}
	
	@Then("Check items in cart")
	public void checkItemsInCart() throws InterruptedException {
		theActorInTheSpotlight().should(seeThat(CheckCart.run(), IsEqual.equalTo(true))
				.orComplainWith(Exception.class, "Items no se agregaron correctamente al carrito."));
		
	}

}
