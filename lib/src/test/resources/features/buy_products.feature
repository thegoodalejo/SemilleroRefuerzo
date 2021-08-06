#Author: elber.ceballos@sophossolutions.com
Feature: Buy a products
  As a tester 
  I want to buy two products in swaglabs
  To probe e-commerce

  Background: 
    Given I want Login in "https://www.saucedemo.com/"
    When I assing "standard_user" "secret_sauce"
    Then I verify that the login is successful

  Scenario: Buy a products
    Given I want to order by price and add two producto to car
    When I proceed with checkout "Duvan" "Ceballos" "111121"
    Then I validate the products
    And check the order are in comming "Your order has been dispatched, and will arrive just as fast as the pony can get there!"
