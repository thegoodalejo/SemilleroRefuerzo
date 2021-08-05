package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.tasks.Login;
import com.sophossolutions.ui.ProductsPage;
import com.sophossolutions.util.Constants;


public class LoginStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}
	
	@Given("I want to go to the website {string}")
	public void iWantToGoToTheWebsite(String strUrl) {
		theActorCalled(Constants.AUTHOR_NAME).wasAbleTo(Open.url(strUrl));
	}

	@When("I enter username {string} password {string}")
	public void iEnterUsernamePassword(String strName, String strPassword) {
		theActorInTheSpotlight().wasAbleTo(Login.withCredentials(strName, strPassword));
	}

	@Then("I verify that i have logged in")
	public void iVerifyThatIHaveLoggedIn() {
		theActorInTheSpotlight().should(seeThat(the(ProductsPage.TXT_TITLE), isVisible()));
	}
	
}
