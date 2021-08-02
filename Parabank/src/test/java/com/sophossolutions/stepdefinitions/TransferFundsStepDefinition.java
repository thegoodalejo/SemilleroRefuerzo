package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.TransferFunds;
import com.sophossolutions.tasks.TransferFundTask;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferFundsStepDefinition
{
	@When("I want to transfer {int} from account {int} to account {int}")
	public void iWantToTransferFromAccountToAccount(Integer intAmount, Integer intFromAccount, Integer intToAccount)
	{
		System.out.println("@WHEN Transfer funds");
		theActorCalled(ACTOR).wasAbleTo(TransferFundTask.fromAAccountToTheOther(intAmount,intFromAccount, intToAccount));
	}

	@Then("Validate the balance of the first account is greater than zero")
	public void validateTheBalanceOfTheFirstAccountIsGreaterThanZero()
	{
		System.out.println("@THEN Transfer funds");
		theActorInTheSpotlight().should(seeThat(TransferFunds.theBalanceFromAccountIsPositive(), IsEqual.equalTo(true)));
	}
}