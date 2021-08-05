#Author: Angel Vivas
Feature: Sign Up into the website SauceDemo
  I want as an automatizer  
  Order products into SauceDemo

	Background: Log in to the website	& Add items with higher price and lower price to cart
		Given I want to go to the website "https://www.saucedemo.com/"
    When I enter username "standard_user" password "secret_sauce"
    Then I verify that i have logged in

		When Add items
    Then Check items in cart

	
  Scenario: Finalize order
    When Add personal data, first name "Angel" last name "Vivas" postal code "10005" 
    Then Check text finish "THANK YOU FOR YOUR ORDER"
