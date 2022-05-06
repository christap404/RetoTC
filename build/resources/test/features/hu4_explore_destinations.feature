#Autor: t.christian@tcs.com

Feature: as a user I wish perform destination specific search

  Background: home page
    Given the user are in the home page

  @TestExploreDestiny
  Scenario: validate option explorer destiny
    When the user are in the option reserve destiny
    And the user use the filter toward
    Then the user will watch the option explore destiny enabled

  @TextExploreDestinyWithNoDate
  Scenario: Validate search destiny
    When the user enter into explorer destiny option
    Then the user can use the options fot search

  @TextExploreDestinyWithDate
  Scenario Outline: validate option explorer destiny with dates
    When the user are in the option reserve destiny
    And the user enter into explorer destiny option
    And the user can select the data <region> <country> <airport>
    Then will watch in the field toward the name of airport <Dortmund (DTM)>

    Examples:
      | region | country  | airport  |
      | Europa | Alemania | Dortmund |



