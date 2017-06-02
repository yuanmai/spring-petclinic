Feature: Login


  Scenario: Login with correct RC phone number
    Given Open "LoginPage"
    When User login with the correct phone number "120" and password "Test!123"
    Then user can access the home page


  Scenario: Login with non-existing RC phone number
    Given Open "LoginPage"
    When User login with a non-existing phone number "120" and password "Test!123"
    Then "ErrorMessage" is shown
