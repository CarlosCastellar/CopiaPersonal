#language:en

Feature: rate product catering

  Scenario: rate product catering
    Given User is login on main page
    Given Page loads and login
    When Select product and rate it
    Then Rated product