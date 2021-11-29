@tripsearch
Feature: Make my trip Search

  Scenario: Search One Way Trip on Make My Trip
    Given I am on Make my trip
    When I perform one way trip search
      | From | Delhi     |
      | To   | Bangalore |
    Then Search results should display for one way trip
      | From | Delhi     |
      | To   | Bangalore |

  Scenario: Search round Way Trip on Make My Trip
    Given I am on Make my trip
    When I perform round way trip search
      | From | Delhi     |
      | To   | Bangalore |
    Then Search results should display for round trip
      | From | Delhi     |
      | To   | Bangalore |
