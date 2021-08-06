package com.sophossolutions.models;

public class Product
{
	private String strName;
	private String strPrice;
	
	public Product(String strName, String strPrice)
	{
		this.strName = strName;
		this.strPrice = strPrice;
	}
	
	public String getStrName()
	{
		return strName;
	}
	
	public String getStrPrice()
	{
		return strPrice;
	}
	
	public boolean isEqueals(Product product)
	{
		if(this.strName.equals(product.getStrName()) && this.strPrice.equals(product.getStrPrice()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}