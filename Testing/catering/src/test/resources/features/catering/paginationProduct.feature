#language:en

Feature: pagination product catering

  Scenario: pagination product catering
    Given User is login on main page
    Given Page loads and login
    When change between pages
    Then You are in last page