@userId
Feature: Get user by ID

  Scenario Outline: Return a user by ID
    Given I set GET user by ID api endpoint
    When I send a GET user by ID request with <id>
    Then I should receive a status of 200 from the get user by ID endpoint
    And The response should contain the user id
    Examples:
      | id   |
      | 1    |
      | 1000 |
      | 385  |
      | 26   |
      | 206  |

  Scenario: Return and verify user 265
    Given I set GET user by ID api endpoint
    When I send a GET user by ID request with 265
    Then I should receive a status of 200 from the get user by ID endpoint
    And The user record should be first name "Madel" and last name "Durdan"

  Scenario Outline: Return an error for an invalid user id
    Given I set GET user by ID api endpoint
    When I send a GET user by ID request with <id>
    Then I should receive a status of 404 from the get user by ID endpoint
    Examples:
      | id   |
      | 1002 |
      | abc  |
      | #87  |
