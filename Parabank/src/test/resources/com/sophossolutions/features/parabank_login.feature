#Author: julian.rodriguez@sophossolutions.com

Feature: test functions login ParaBank
  I want to prove that I can log into ParaBank

  Scenario: Login in ParaNank
    Given I want to go to the page "https://parabank.parasoft.com/parabank/index.htm"
    When Login with the username "john" and password "demo"
    Then Load page
