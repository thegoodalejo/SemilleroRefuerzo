package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static com.sophossolutions.util.Constants.NO_FINISH_OK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.exceptions.Error;
import com.sophossolutions.questions.CheckoutQuestion;
import com.sophossolutions.tasks.CheckoutTask;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinition
{
	@When("Add the next info first name {string} last name {string} and zip code {string}")
	public void addTheNextInfoFirstNameLastNameAndZipCode(String strFistname, String strLastName, String strZipcode)
	{
		System.out.println("@WHEN checkout");
		theActorCalled(ACTOR).wasAbleTo(CheckoutTask.withData(strFistname, strLastName, strZipcode));
	}

	@Then("Verify that the text {string} is visible")
	public void verifyThatTheTextIsVisible(String strText)
	{
		System.out.println("@THEN checkout");
		theActorInTheSpotlight().should(seeThat(CheckoutQuestion.finishedOK(strText), IsEqual.equalTo(true)).orComplainWith(Error.class, NO_FINISH_OK));
	}
}