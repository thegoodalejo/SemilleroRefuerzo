#Author: juan.blanco@sophossolutions.com
Feature: Login User in page
  This action is login a user and check your state

  Scenario: Login with User
    Given I want to go to page
    When Login in account with the credentials "standard_user" "secret_sauce"
    Then Verify the state of account
