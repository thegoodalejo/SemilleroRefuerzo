package com.sophossolutions.interactions;

import static com.sophossolutions.util.Constants.PROFILE1;
import static com.sophossolutions.util.Constants.PROFILE2;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import com.sophossolutions.models.Profile;
import com.sophossolutions.ui.UpdateContact;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class RememberData implements Interaction
{
	private DataTable dataTable;
	
	public RememberData(DataTable dataTable)
	{
		this.dataTable = dataTable;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		String strFirstName = UpdateContact.TXT_FIRST_NAME.resolveFor(theActorInTheSpotlight()).getTextValue();
		String strLastName = UpdateContact.TXT_LAST_NAME.resolveFor(theActorInTheSpotlight()).getTextValue();
	    String strAddress = UpdateContact.TXT_ADDRESS.resolveFor(theActorInTheSpotlight()).getTextValue();
	    String strCity = UpdateContact.TXT_CITY.resolveFor(theActorInTheSpotlight()).getTextValue();
	    String strState = UpdateContact.TXT_STATE.resolveFor(theActorInTheSpotlight()).getTextValue();
	    String strZipCode = UpdateContact.TXT_ZIP.resolveFor(theActorInTheSpotlight()).getTextValue();
	    String strPhone = UpdateContact.TXT_PHONE.resolveFor(theActorInTheSpotlight()).getTextValue();
	    Profile profile1 = new Profile(strFirstName, strLastName, strAddress, strCity, strState, strZipCode, strPhone);
		actor.remember(PROFILE1, profile1);
	    
	    List<List<String>> rows = dataTable.asList(List.class);
	    
	    strFirstName = rows.get(0).get(0);
	    strLastName = rows.get(0).get(1);
	    strAddress = rows.get(0).get(2);
	    strCity = rows.get(0).get(3);
	    strState = rows.get(0).get(4);
	    strZipCode = rows.get(0).get(5);
	    strPhone = rows.get(0).get(6);
	    Profile profile2 = new Profile(strFirstName, strLastName, strAddress, strCity, strState, strZipCode, strPhone);
	    actor.remember(PROFILE2, profile2);
	    
	    //System.out.println(profile1);
	    //System.out.println(profile2);
	}
	
	public static RememberData profile(DataTable dataTable)
	{
		return instrumented(RememberData.class, dataTable);
	}
}