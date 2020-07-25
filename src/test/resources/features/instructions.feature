@instructions
Feature: Instructions

  Scenario: Return instructions
    Given I set GET instructions api endpoint
    When I send a GET instructions HTTP request
    Then I should receive a status of 200 from the instructions endpoint
    And I should receive my instructions