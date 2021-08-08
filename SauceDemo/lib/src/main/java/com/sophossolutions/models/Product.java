package com.sophossolutions.models;

public class Product {
	private String strName;
	private String strDescription;
	private Double dblPrice;
	private final String FORMAT_PRODUCT = "|%-15s|%-200s|";
	
	public Product(String strName, String strDescription, Double strPrice) {
		super();
		this.strName = strName;
		this.strDescription = strDescription;
		this.dblPrice = strPrice;
	}

	public String getStrName() {
		return strName;
	}

	public String getStrDescription() {
		return strDescription;
	}

	public Double getDblPrice() {
		return dblPrice;
	}
	
	public void showProduct() {
		System.out.println(String.format(FORMAT_PRODUCT, "Name", getStrName()));
		System.out.println(String.format(FORMAT_PRODUCT, "Description", getStrDescription()));
		System.out.println(String.format(FORMAT_PRODUCT, "Price", "$" + getDblPrice()));
	}
}
