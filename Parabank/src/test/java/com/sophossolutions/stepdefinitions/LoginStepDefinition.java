package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import static com.sophossolutions.util.Constants.ACTOR;

import com.sophossolutions.tasks.LoginTask;

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

	@Then("Load page")
	public void loadPage()
	{
		System.out.println("@THEN login");
	}	
}