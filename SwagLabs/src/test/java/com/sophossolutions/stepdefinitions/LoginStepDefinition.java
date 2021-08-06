package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.tasks.LoginTask;
import com.sophossolutions.ui.Products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

public class LoginStepDefinition
{	
	@Given("I want to go to the page {string}")
	public void iWantToGoToThePage(String strUrl)
	{
		System.out.println("@GIVEN login");
		theActorCalled(ACTOR).wasAbleTo(Open.url(strUrl));
	}

	@When("Login with the username {string} and password {string}")
	public void loginWithTheUsernameAndPassword(String strUser, String strPassword)
	{
		System.out.println("@WHEN login");
		theActorCalled(ACTOR).wasAbleTo(LoginTask.withCredential(strUser, strPassword));
	}

	@Then("verify that I was able to log in")
	public void verifyThatIWasAbleToLogIn()
	{
		System.out.println("@THEN new account");
		theActorInTheSpotlight().should(seeThat(the(Products.TXT_TITLE), isVisible()));
	}
}