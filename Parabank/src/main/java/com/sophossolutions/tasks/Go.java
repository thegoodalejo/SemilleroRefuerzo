package com.sophossolutions.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.ui.ParabankPanel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Go implements Task
{
	private String strSection;
	
	public Go(String strSection)
	{	
		this.strSection = strSection;
	}

	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(Click.on(ParabankPanel.getSection(strSection)));
	}
	
	public static Go redirect(String strSection)
	{
		return instrumented(Go.class, strSection);
	}
}