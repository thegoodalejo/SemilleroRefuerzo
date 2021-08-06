package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static com.sophossolutions.util.Constants.NO_ITEMS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophossolutions.exceptions.Error;
import com.sophossolutions.questions.AddProducts;
import com.sophossolutions.tasks.AddProductsTask;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductsStepDefinition
{
	@When("Add intems in the cart")
	public void addIntemsInTheCart()
	{
		System.out.println("@WHEN add products");
		theActorCalled(ACTOR).wasAbleTo(AddProductsTask.toCart());
	}

	@Then("validate that the items exist in the cart")
	public void validateThatTheItemsExistInTheCart()
	{
		System.out.println("@THEN add products");
		theActorInTheSpotlight().should(seeThat(AddProducts.existToCart(), IsEqual.equalTo(true)).orComplainWith(Error.class, NO_ITEMS));
	}
}