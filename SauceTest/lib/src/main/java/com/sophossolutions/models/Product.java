package com.sophossolutions.models;

public class Product {
	
	private String name;
	private String description;
	private String price;
	
	public Product(String name, String description, String price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}	

}
