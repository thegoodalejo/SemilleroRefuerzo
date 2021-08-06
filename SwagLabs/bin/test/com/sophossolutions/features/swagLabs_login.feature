#Author: julian.rodriguez@sophossolutions.com
Feature: Test function login Swag Labs
  I want to prove that I can log into SwagLabs

  Scenario: Login in SwagLabs
    Given I want to go to the page "https://www.saucedemo.com/"
    When Login with the username "standard_user" and password "secret_sauce"
    Then verify that I was able to log in
