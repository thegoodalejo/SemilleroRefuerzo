#Author: juan.blanco@sophossolutions.com
Feature: Add an item to the cart
  This action is login a user and check your state

  Background: 
    Given I want to go to page
    When Login in account with the credentials "standard_user" "secret_sauce"
    Then Verify the state of account

  Scenario: Add an item to the cart
    Given I am on the product list
    When I select the most expensive item
    And I select the cheapest item
    Then I verify that it is in the cart
