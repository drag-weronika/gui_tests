@test
@login
Feature: Login

  @TC002
  Scenario: Login with invalid password
    Given I navigate to last.fm login page
    When I set email
    Then I set invalid password
    Then I click submit button
    Then I should see alert displayed

