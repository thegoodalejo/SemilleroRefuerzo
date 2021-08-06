package com.sophossolutions.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophossolutions.models.Product;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Remember implements Interaction
{
	private String rememberText;
	private Target trgName, trgPrice;
	
	public Remember(String rememberText, Target... targets)
	{
		this.rememberText = rememberText;
		this.trgName = targets[0];
		this.trgPrice = targets[1];
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		String strName = this.trgName.resolveFor(theActorInTheSpotlight()).getTextValue();
		String strPrice = this.trgPrice.resolveFor(theActorInTheSpotlight()).getTextValue();
		Product product = new Product(strName, strPrice);
		actor.remember(rememberText, product);
	}
	
	public static Remember product(String rememberText, Target... targets)
	{
		return instrumented(Remember.class, rememberText, targets);
	}
}