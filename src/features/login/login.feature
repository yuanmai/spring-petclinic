Feature: Login

  Scenario: Login happy path
    Given user has valid account
    When use login with correct username and password
    Then user can access the home page

   Scenario: Login again without logout need password
     Given user close app directly witout logout
     When open app again
     Then need to input password again

   Scenario: Login when forgot password
     Given user forgot password
     When user click the forgot password button
     Then Forget password screen displayed
