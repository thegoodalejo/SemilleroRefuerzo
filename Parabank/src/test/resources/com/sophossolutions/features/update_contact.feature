#Author: julian.rodriguez@sophossolutions.com
Feature: Update contact in ParaBank
  I want to test the update contact info of profile

  Background: Login in ParaNank
    Given I want to go to the page "https://parabank.parasoft.com/parabank/index.htm"
    When Login with the username "john" and password "demo"
    Then Load page

  Scenario: Update contact info
    Given I want to go to the section "Update contact"
    When I want to update the profile information with
      | John | Smith | 1431 Main St | Bogota | CU | 902101 | 310-447-4121 |
    Then Validate if there was any change in the profile information
