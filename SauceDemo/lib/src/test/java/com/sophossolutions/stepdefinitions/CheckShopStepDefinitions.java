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

import com.sophossolutions.task.EndShop;

import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.constants.Constants.CHEAPEST_KEY;
import static com.sophossolutions.constants.Constants.EXPENSIVE_KEY;
import static com.sophossolutions.ui.UserPage.INPUT_FIRST_NAME;
import static com.sophossolutions.ui.UserPage.INPUT_LAST_NAME;
import static com.sophossolutions.ui.UserPage.INPUT_POSTAL_CODE;
import static com.sophossolutions.ui.CheckoutPage.BUTTON_FINISH;
import static com.sophossolutions.ui.CheckoutPage.TEXT_PRICE;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;

public class CheckShopStepDefinitions {
		
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@Given("I am on the user page")
	public void iAmOnTheUserPage() {
	    theActorCalled(ACTOR_NAME).should(seeThat(the(INPUT_FIRST_NAME), isVisible()));
	    theActorInTheSpotlight().should(seeThat(the(INPUT_LAST_NAME), isVisible()));
	    theActorInTheSpotlight().should(seeThat(the(INPUT_POSTAL_CODE), isVisible()));
	}

	@When("Continue the shop")
	public void continueTheShop() {
	   theActorInTheSpotlight().wasAbleTo(EndShop.with());
	}

	@Then("Verify the shop")
	public void verifyTheShop() {
		Target expensiveItem = TEXT_PRICE.of(theActorInTheSpotlight().recall(EXPENSIVE_KEY).toString());
		Target cheapestItem  = TEXT_PRICE.of(theActorInTheSpotlight().recall(CHEAPEST_KEY ).toString());
	    theActorInTheSpotlight().should(seeThat(the(expensiveItem), isVisible()));
	    theActorInTheSpotlight().should(seeThat(the(cheapestItem), isVisible()));
	    theActorInTheSpotlight().wasAbleTo(Click.on(BUTTON_FINISH));
	}
}
