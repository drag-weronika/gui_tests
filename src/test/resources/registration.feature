@test
@registration
Feature: Registration

  @TC02
  Scenario: Fill invalid registration data
    Given I navigate to last.fm registration page
    When I enter email with invalid format
    Then I see alert message displayed
