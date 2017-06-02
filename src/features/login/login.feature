Feature: Login

  Scenario: Login happy path
    Given user has valid account
    When use login with correct username and password
    Then user can access the home page

   Scenario: Need login when reopen app
     Given user close app directly witout logout
     When open app again
     Then need to input password again
