package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophossolutions.tasks.Go;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinition
{	
	@Given("I want to go to the section {string}")
	public void iWantToGoToTheSection(String strSection)
	{
		System.out.println("@GIVEN global");
		theActorCalled(ACTOR).wasAbleTo(Go.redirect(strSection));
	}
	
	@Before
	public void setup()
	{	
		setTheStage(new OnlineCast());
	}
	
}