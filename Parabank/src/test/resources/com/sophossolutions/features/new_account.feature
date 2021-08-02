#Author: julian.rodriguez@sophossolutions.com
Feature: Create a new account in ParaBank
  I want to test the function of creating a new account

  Background: Login in ParaNank
    Given I want to go to the page "https://parabank.parasoft.com/parabank/index.htm"
    When Login with the username "john" and password "demo"
    Then Load page

  Scenario: Create new account
    Given I want to go to the section "Create account"
    When I want to create the new account from 1 and "SAVINGS"
    Then Validate that the account was created
