#Author: julian.rodriguez@sophossolutions.com
Feature: Tranfer funds in ParaBank
  I want to test the transfer funds of account to other

  Background: Login in ParaNank
    Given I want to go to the page "https://parabank.parasoft.com/parabank/index.htm"
    When Login with the username "john" and password "demo"
    Then Load page

  Scenario: Tranfer funds
    Given I want to go to the section "Transfer funds"
    When I want to transfer 200 from account 1 to account 2
    Then Validate the balance of the first account is greater than zero
