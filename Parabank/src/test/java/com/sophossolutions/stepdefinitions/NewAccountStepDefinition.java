package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.NewAccount;
import com.sophossolutions.tasks.NewAccountTask;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountStepDefinition
{
	@When("I want to create the new account from {int} and {string}")
	public void iWantToCreateTheNewAccountFromAnd(int intAccount, String strTypeAccount)
	{
		System.out.println("@WHEN new account");
		theActorCalled(ACTOR).wasAbleTo(NewAccountTask.withType(intAccount, strTypeAccount));
	}

	@Then("Validate that the account was created")
	public void validateThatTheAccountWasCreated()
	{
		System.out.println("@THEN new account");
		theActorInTheSpotlight().should(seeThat(NewAccount.wasCreateTheAccount(), IsEqual.equalTo(true)));
	}
}