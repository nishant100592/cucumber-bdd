Feature: Free CRM login

  Scenario: Valid login test

    Given User on login page

    When User enters valid username

    And User enters valid password

    And User clicks on Login button

    Then User on homepage