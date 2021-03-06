Feature: Trip Functionality

  Background: Trip Background
    Given Type of trip to be selected
    Then City to be Selected
    When Verify the date block

  @Smoke
  Scenario: Search Round Trip
    And Date to be selected
    And Number of adults to be selected
    And Select Currency
    And Search for the flight
    Then Verify the data

  @Smoke @Scenario
  Scenario Outline: Search Round Trip with Data
    And Date to be selected in <month1> <month2> <date1> <date2>
    And Number of adults to be selected
    And Select Currency
    And Search for the flight
    Then Verify the data

    Examples: 
      | month1  | month2   | date1 | date2 |
      | October | December |    20 |    15 |
      | August  | October  |    12 |     7 |
