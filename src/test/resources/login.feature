@tests
@login
Feature: Login

  Scenario: Login with invalid password
    Given I navigate to login page
    When I set email
    Then I set password
    Then I click submit button
    Then I should see main page displayed