@user
Feature: Get user list

  Scenario: Return a user list
    Given I set GET user api endpoint
    When I send a GET user list HTTP request
    Then I should receive a status of 200 from the user list endpoint

  Scenario: Verify user list being returned
    Given I set GET user api endpoint
    When I send a GET user list HTTP request
    Then The first user record returned should be Maurise