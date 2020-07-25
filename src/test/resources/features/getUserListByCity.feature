@city
Feature: Get users by city

  Scenario Outline: Return a list of users by city
    Given I set GET city api endpoint
    When I send a GET city HTTP request with <city>
    Then I should receive a status of 200 from the city endpoint
    Examples:
      | city   |
      | London |
      | Madrid |
      | Oslo   |

  Scenario: Verify user data being returned
    Given I set GET city api endpoint
    When I send a GET city HTTP request with London
    Then The first record returned should be id 135

  Scenario: Verify error message if no city is passed
    Given I set GET city api endpoint
    When I send a GET city HTTP request with test
    Then I should receive a status of 200 from the city endpoint
    And The response body should be empty