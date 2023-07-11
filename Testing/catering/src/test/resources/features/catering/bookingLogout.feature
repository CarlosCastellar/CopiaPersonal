#language:en

Feature: booking user logout catering

  Scenario: booking user logout catering
    Given User is on main page
    When Page loads select product and reserved it
    Then You has message that you are logout