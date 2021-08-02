package com.sophossolutions.tasks;

import static com.sophossolutions.util.Constants.PROFILE2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.interactions.RememberData;
import com.sophossolutions.models.Profile;
import com.sophossolutions.ui.UpdateContact;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UpdateContactTask implements Task
{
	private DataTable dataTable;
	
	public UpdateContactTask(DataTable dataTable)
	{
		this.dataTable = dataTable;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo(RememberData.profile(dataTable));
		Profile profile = actor.recall(PROFILE2);
		actor.attemptsTo(Enter.theValue(profile.getStrFirsName()).into(UpdateContact.TXT_FIRST_NAME),
			Enter.theValue(profile.getStrLastName()).into(UpdateContact.TXT_LAST_NAME),
			Enter.theValue(profile.getStrAddress()).into(UpdateContact.TXT_ADDRESS),
			Enter.theValue(profile.getStrCity()).into(UpdateContact.TXT_CITY),
			Enter.theValue(profile.getStrState()).into(UpdateContact.TXT_STATE),
			Enter.theValue(profile.getStrZipCode()).into(UpdateContact.TXT_ZIP),
			Enter.theValue(profile.getStrPhone()).into(UpdateContact.TXT_PHONE),
			Click.on(UpdateContact.BTN_UPDATE));
	}
	
	public static UpdateContactTask withInfo(DataTable dataTable)
	{
		return instrumented(UpdateContactTask.class, dataTable);
	}
}