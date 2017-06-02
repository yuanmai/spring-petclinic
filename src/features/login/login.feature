Feature: Login

  Scenario: Login happy path
    Given user has valid account
    When use login with correct username and password
    Then user can access the home page

  Scenario: Login with Remember me checked
    Given user has valid account
    When user enter credentials
    And mark on remember me
    And click login button
    And click logout
    Then  User name and password are remembered

  Scenario: Login failure path
    Given user has valid account
    When user enter an incorrect credential
    And click login button
    Then user get an error popup message
