Feature: Login


  Scenario: Login happy path
    Given user has valid account
    When User login with the phone number and password
    Then user can access the home page


  Scenario Outline: Login with non-existing RC phone number
    Given User has a non-existing <phonenumber>
    When User login with the phone number and password
    Then <Errormessage> is shown
    |phonenumber|ErrorMessage|
    |    110       |   Login Fail         |
