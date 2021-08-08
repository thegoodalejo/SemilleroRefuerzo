package com.sophossolutions.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.ThePrice;
import com.sophossolutions.task.AddUserData;
import com.sophossolutions.task.CalculateShop;

import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.constants.Constants.TOTAL_PRICE_KEY;
import static com.sophossolutions.constants.Constants.TEXT_OF_PRICE;
import static com.sophossolutions.ui.CheckoutPage.TEXT_TOTAL_PRICE;
import static com.sophossolutions.ui.CheckoutPage.BUTTON_FINISH;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CheckShopStepDefinitions {
	
	private Double dblTotalShop;
	
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@Given("Enter user data")
	public void enterUserData(DataTable dataUser) {
	    theActorCalled(ACTOR_NAME).wasAbleTo(AddUserData.with(dataUser));
	}

	@When("Calculate shop")
	public void calculateShop() {
		theActorInTheSpotlight().wasAbleTo(CalculateShop.now());
		dblTotalShop = theActorInTheSpotlight().recall(TOTAL_PRICE_KEY);
	}
	
	@Then("Verify the shop")
	public void verifyTheShop() {
		theActorInTheSpotlight().should(seeThat(
				ThePrice.seen(TEXT_TOTAL_PRICE),
				IsEqual.equalTo(TEXT_OF_PRICE+dblTotalShop.toString())
		));
		theActorInTheSpotlight().wasAbleTo(Click.on(BUTTON_FINISH));
	}
	
	
}
