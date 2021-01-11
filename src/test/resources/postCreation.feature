@createPost
Feature: Post creation

  Scenario: Post creation
    Given I navigate to home page
    And I navigate to Editor by link
    And I set title
    And I set description
    And I set content
    And I set tag
    When I submit posting
    Then I should see post created with icons for edition, deletion and commenting
    And I navigate to home page
    When I click Global Feed tab
    Then I should see the post listed