package com.sophossolutions.models;

public class Product {
	private String strName;
	private String strDescription;
	private Double strPrice;
	
	public Product(String strName, String strDescription, Double strPrice) {
		super();
		this.strName = strName;
		this.strDescription = strDescription;
		this.strPrice = strPrice;
	}

	public String getStrName() {
		return strName;
	}

	public String getStrDescription() {
		return strDescription;
	}

	public Double getStrPrice() {
		return strPrice;
	}
	
	
}
