Feature: Login


  Scenario: Login happy path
    Given user has valid account
    When User login with the phone number and password
    Then user can access the home page


  Scenario: Login with non-existing RC phone number
    Given User has a non-existing phone number
    When User login with the phone number and password
    Then Error message is shown
