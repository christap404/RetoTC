#Actor: Christian Tapias Escudero - t.christian@tcs.com

Feature: as a user want to validate the status of my flight

  Background: home page
    Given the user are in home page

  @SmockTest
  Scenario: smock test status of flight
    When enter to flight status option
    And the flight status elements are reviewed
    When enter reserve flight option
    And the reserve flight elements are reviewed
    Then the smock test passed

  @ConsultFlightStatus
  Scenario: consult flight status
    When the user enter to flight status
    When the user enter the origin, destination and date of flight
      | Cali | Medellin |
    Then the user will watch the state confirmed CONFIRMADO

  @ConsultFlightWithNumber
  Scenario: consult flight status for number of flight
    When the user enter to flight status
    And the user click on radio button flight number
    And copy the flight number for file txt with the date 13 noviembre
    Then the user will watch the state confirmed CONFIRMADO




