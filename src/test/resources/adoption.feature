@tests
Feature: Adoption of puppy

  @TC01
  Scenario: Adopt Brooke, add a Chewy Toy and a Travel Carrier, pay with Check
    And I navigate to the HomePage
    And I open Brook details card
    And I submit adoption
    And I set Chewy Toy in basket
    And I set Travel Carrier in basket
    And I complete adoption
    And I enter personal details
    And I set payment method to Check
    And I place order
    And I assert info of successful adoption is displayed

  @TC02
  Scenario: Adopt Sparky, add a Collar & Leash, pay with Credit Card
    And I navigate to the HomePage
    And I open Sparky details card
    And I submit adoption
    And I set Collar & Leash in basket
    And I complete adoption
    And I enter personal details
    And I set payment method to Credit Card
    And I place order
    And I assert info of successful adoption is displayed

  @TC03
  Scenario: Adopt 2 Random Dogs add a Collar & Leash to each, pay with Credit Card
    And I navigate to the HomePage
    And I choose randomly two puppies
    And I open first randomly choosen details card
    And I submit adoption
    And I continue adoption
    And I open second randomly details card
    And I submit adoption
    And I check Collar & Lash for each
    And I complete adoption
    And I enter personal details
    And I set payment method to Credit Card
    And I place order
    And I assert info of successful adoption is displayed