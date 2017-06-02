Feature: Login


  Scenario: Login with correct RC phone number
    Given User login with the correct phone number "120" and password "Test!123"
    When Click LoginButton
    Then user can access the home page


  Scenario: Login with non-existing RC phone number
    Given User login with a non-existing phone number "120" and password "Test!123"
    When Click LoginButton
    Then "ErrorMessage" is shown
