package com.sophossolutions.models;

public class Profile
{
	private String strFirsName;
	private String strLastName;
	private String strAddress;
	private String strCity;
	private String strState;
	private String strZipCode;
	private String strPhone;
	
	public Profile(String strFirsName, String strLastName, String strAddress, String strCity, String strState, String strZipCode, String strPhone)
	{
		this.strFirsName = strFirsName;
		this.strLastName = strLastName;
		this.strAddress = strAddress;
		this.strCity = strCity;
		this.strState = strState;
		this.strZipCode = strZipCode;
		this.strPhone = strPhone;
	}

	public String getStrFirsName()
	{
		return strFirsName;
	}

	public String getStrLastName()
	{
		return strLastName;
	}

	public String getStrAddress()
	{
		return strAddress;
	}

	public String getStrCity()
	{
		return strCity;
	}

	public String getStrState()
	{
		return strState;
	}

	public String getStrZipCode()
	{
		return strZipCode;
	}

	public String getStrPhone()
	{
		return strPhone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((strAddress == null) ? 0 : strAddress.hashCode());
		result = prime * result + ((strCity == null) ? 0 : strCity.hashCode());
		result = prime * result + ((strFirsName == null) ? 0 : strFirsName.hashCode());
		result = prime * result + ((strLastName == null) ? 0 : strLastName.hashCode());
		result = prime * result + ((strPhone == null) ? 0 : strPhone.hashCode());
		result = prime * result + ((strState == null) ? 0 : strState.hashCode());
		result = prime * result + ((strZipCode == null) ? 0 : strZipCode.hashCode());
		return result;
	}

	public boolean equals(Profile profile)
	{
		if(this.strFirsName.equals(profile.getStrFirsName())
			&& this.strLastName.equals(profile.getStrLastName())
			&& this.strAddress.equals(profile.getStrAddress())
			&& this.strCity.equals(profile.getStrCity())
			&& this.strState.equals(profile.getStrState())
			&& this.strZipCode.equals(profile.getStrZipCode())
			&& this.strPhone.equals(profile.getStrPhone())
		)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String toString()
	{
		return "Profile [strFirsName=" + strFirsName + ", strLastName=" + strLastName + ", strAddress=" + strAddress
				+ ", strCity=" + strCity + ", strState=" + strState + ", strZipCode=" + strZipCode + ", strPhone="
				+ strPhone + "]";
	}
}