#Author: julian.rodriguez@sophossolutions.com
Feature: Test function add prducts in cart Swag Labs
  I want to test that I can add products in the cart of SwagLabs

  Background: Login in SwagLabs
    Given I want to go to the page "https://www.saucedemo.com/"
    When Login with the username "standard_user" and password "secret_sauce"
    Then verify that I was able to log in

  Scenario: Add intems in the cart
    When Add intems in the cart
    Then validate that the items exist in the cart
