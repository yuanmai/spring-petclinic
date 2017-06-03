Feature: Login

  Scenario: Login happy path
    Given user has valid account
    When use login with correct username and password
    Then user can access the home page

  Scenario: Login with Remember me checked
    Given user has valid account
    When user login successfully with remember me
    And user logout
    Then  User name and password are remembered

  Scenario: Login failure path
    Given user has valid account
    When user enter an incorrect credential
    Then user get an error popup message

  Scenario: Login failure path
    Given user has valid account
    When user enter an incorrect username
    Then user get an error popup message

  Scenario: Login with remember me unchecked
    Given user has valid account
    When leave remember me unchecked
    And use login with correct username and password
    Then user can access the home page

