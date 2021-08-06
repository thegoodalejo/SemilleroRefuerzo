#Author: julian.rodriguez@sophossolutions.com
Feature: Test function checkout Swag Labs
  I want to prove that I can to do checkout into SwagLabs

  Background: Login in SwagLabs
    Given I want to go to the page "https://www.saucedemo.com/"
    When Login with the username "standard_user" and password "secret_sauce"
    Then verify that I was able to log in
    When Add intems in the cart
    Then validate that the items exist in the cart

  Scenario: Checkout SwagLabs
    When Add the next info first name "Julian" last name "Rodriguez" and zip code "250252"
    Then Verify that the text "THANK YOU FOR YOUR ORDER" is visible
