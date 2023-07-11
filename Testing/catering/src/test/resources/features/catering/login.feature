#language:en

Feature: login catering

  Scenario: login catering
    Given User is login on main page
    When Page loads and login
    Then You are in the main menu of your account