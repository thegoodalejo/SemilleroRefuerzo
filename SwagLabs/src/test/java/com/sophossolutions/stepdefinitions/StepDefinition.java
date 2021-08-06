package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinition
{
	
	@Before
	public void setup()
	{	
		setTheStage(new OnlineCast());
	}
	
}