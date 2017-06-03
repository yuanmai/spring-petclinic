Feature: Login


  Scenario: Login with correct RC phone number
    When User login with a phone number "120" and password "123"
    Then user can access the home page


  Scenario: Login with non-existing RC phone number
    When User login with a phone number "110" and password "123"
    Then "Login Fail" is shown
