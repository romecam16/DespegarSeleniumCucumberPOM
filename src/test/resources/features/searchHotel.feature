Feature: Despegar hotel search

  Scenario Outline: User search hotel for a city
    Given I navigate to Home Page
    When I search for a hotel in a ciudad
    Then I will see the results available to book
    Examples:
      |ciudad|fecha_salida|fecha_regreso
      |cancun|15/12/2019|18/12/2019




  Scenario: User search hotel for unexisting city
      Given I navigate to Home Page
      When I search for a hotel in an unexisting city
      Then I will not see any results


