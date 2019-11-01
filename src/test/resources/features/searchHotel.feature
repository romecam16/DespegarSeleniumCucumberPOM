Feature: Despegar hotel search

  Scenario: User search hotel for a city
    Given I navigate to Home Page
    When I search for a hotel in a city
    Then I will see the results available to book

    Scenario: User search hotel for unexisting city
      Given I navigate to Home Page
      When I search for a hotel in an unexisting city
      Then I will not see any results


