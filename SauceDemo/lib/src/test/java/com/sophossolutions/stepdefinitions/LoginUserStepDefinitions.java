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
import com.sophossolutions.task.LoginUser;
import com.sophossolutions.ui.HomePage;

import static com.sophossolutions.constants.Constants.ACTOR_NAME;
import static com.sophossolutions.ui.ProductsPage.ICON_CART;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginUserStepDefinitions {
	
	private HomePage SauceDemoHomePage;
	
	@Before
	public void setup(){
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to go to page")
	public void iWantToGoToPage() {
	    theActorCalled(ACTOR_NAME).wasAbleTo(Open.browserOn(SauceDemoHomePage));
	}

	@When("Login in account with the credentials {string} {string}")
	public void loginInAccountWithTheCredentials(String strUsername, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(LoginUser.with(strUsername, strPassword));
	}

	@Then("Verify the state of account")
	public void verifyTheStateOfAccount() {
	    theActorInTheSpotlight().should(seeThat(the(ICON_CART), isVisible()));
	}
}
