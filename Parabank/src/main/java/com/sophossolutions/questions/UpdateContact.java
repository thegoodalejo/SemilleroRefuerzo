package com.sophossolutions.questions;

import static com.sophossolutions.util.Constants.PROFILE1;
import static com.sophossolutions.util.Constants.PROFILE2;

import com.sophossolutions.models.Profile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UpdateContact implements Question<Boolean>
{
	public UpdateContact()
	{}
	
	@Override
	public Boolean answeredBy(Actor actor)
	{	
		Profile previousProfile = actor.recall(PROFILE1);
		Profile newProfile = actor.recall(PROFILE2);
		if(previousProfile.equals(newProfile))
		{
			return true;
		}
		return false;
	}
	
	public static UpdateContact isEqualToPreviowsInfo()
	{
		return new UpdateContact();
	}
}