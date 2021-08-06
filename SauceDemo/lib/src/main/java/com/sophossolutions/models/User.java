package com.sophossolutions.models;

public class User {
	private String strFirstName;
	private String strLastName;
	private String strPostalCode;
	
	public User() {
		super();
		this.strFirstName = "Juan";
		this.strLastName = "Miguel";
		this.strPostalCode = "12345";
	}
	
	public User(String strFirstName, String strLastName, String strPostalCode) {
		super();
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.strPostalCode = strPostalCode;
	}
	public String getStrFirstName() {
		return strFirstName;
	}
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	public String getStrLastName() {
		return strLastName;
	}
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	public String getStrPostalCode() {
		return strPostalCode;
	}
	public void setStrPostalCode(String strPostalCode) {
		this.strPostalCode = strPostalCode;
	}
	
	
}
