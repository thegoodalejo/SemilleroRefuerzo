#Author: juan.blanco@sophossolutions.com
Feature: Verify shop
  This action is login a user and check your state

  Background: Login with User
    Given I want to go to page
    When Login in account with the credentials "standard_user" "secret_sauce"
    Then Verify the state of account
    Given I am on the product list
    When I select the most expensive item
    And I select the cheapest item
    Then I verify that it is in the cart

  @VerifyShop
  Scenario: Add info to User
    Given I am on the user page
    When Continue the shop
    Then Verify the shop
