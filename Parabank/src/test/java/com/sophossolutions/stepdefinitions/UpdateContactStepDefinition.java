package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.questions.UpdateContact;
import com.sophossolutions.tasks.UpdateContactTask;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateContactStepDefinition
{
	@When("I want to update the profile information with")
	public void iWantToUpdateTheProfileInformationWith(DataTable dataTable)
	{
		System.out.println("@WHEN Update contact");
		theActorCalled(ACTOR).wasAbleTo(UpdateContactTask.withInfo(dataTable));
	}

	@Then("Validate if there was any change in the profile information")
	public void validateIfThereWasAnyChangeInTheProfileInformation()
	{
		System.out.println("@THEN Update contact");
		theActorInTheSpotlight().should(seeThat(UpdateContact.isEqualToPreviowsInfo(), IsEqual.equalTo(false)));
	}
}