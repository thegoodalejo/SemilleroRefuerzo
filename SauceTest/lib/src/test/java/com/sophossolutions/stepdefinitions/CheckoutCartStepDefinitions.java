package com.sophossolutions.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.sophossolutions.questions.OrderCompleted;
import com.sophossolutions.tasks.Checkout;
import com.sophossolutions.exceptions.Exception;


public class CheckoutCartStepDefinitions {
	
	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}		
	
	@When("Add personal data, first name {string} last name {string} postal code {string}")
	public void addPersonalDataFirstNameLastNamePostalCode(String strFirstName, String strLastName, String strPostalCode) {
		theActorInTheSpotlight().wasAbleTo(Checkout.with(strFirstName, strLastName, strPostalCode));
	}

	@Then("Check text finish {string}")
	public void checkTextFinish(String strMessageCompleted) {
		theActorInTheSpotlight().should(seeThat(OrderCompleted.message(), IsEqual.equalTo(strMessageCompleted))
				.orComplainWith(Exception.class, "Compra no ha finalizado con éxito!"));
	}

}
