#Author: Angel Vivas
Feature: Log into the website SauceDemo
  I want as an automatizer  
  to log into SauceDemo and
  validate that I have login

  Scenario: Log in to the website
    Given I want to go to the website "https://www.saucedemo.com/"
    When I enter username "standard_user" password "secret_sauce"
    Then I verify that i have logged in
