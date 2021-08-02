package com.sophossolutions.ui;

import static com.sophossolutions.util.Constants.CREATE;
import static com.sophossolutions.util.Constants.LIST;
import static com.sophossolutions.util.Constants.TRANSFER;
import static com.sophossolutions.util.Constants.UPDATE;

import net.serenitybdd.screenplay.targets.Target;

public class ParabankPanel
{
	private static final Target LINK_NEW_ACCOUNT = Target.the("Link to create new account").locatedBy("//*[@id='leftPanel']//ul//li[1]//a");
	private static final Target LINK_ACCOUNTS_OVERVIEW = Target.the("Link to see the accounts").locatedBy("//*[@id='leftPanel']//ul//li[2]//a");
	private static final Target LINK_TRANSFER_FUNDSACCOUNT = Target.the("Link to transfer funds").locatedBy("//*[@id='leftPanel']//ul//li[3]//a");
	private static final Target LINK_UPDATE_CONTACT_INFO = Target.the("Link to update contack info").locatedBy("//*[@id='leftPanel']//ul//li[6]//a");

	public static Target getSection(String strSection)
	{	
		Target section = null;
		if(strSection.equals(CREATE))
		{
			section = LINK_NEW_ACCOUNT;
		}
		else if(strSection.equals(LIST))
		{
			section = LINK_ACCOUNTS_OVERVIEW;
		}
		else if(strSection.equals(TRANSFER))
		{
			section = LINK_TRANSFER_FUNDSACCOUNT;
		}
		else if(strSection.equals(UPDATE))
		{
			section = LINK_UPDATE_CONTACT_INFO;
		}
		return section;
	}
}