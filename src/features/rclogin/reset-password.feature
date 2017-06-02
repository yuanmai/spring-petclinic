@rcLogin
Feature: rcLogin

  Scenario: Reset password with incorrect previous password
    Given user has redirect to reset password page successfully
    When user reset password with incorrect previous password with "Test!999" and "Jennifer!123" and "Jennifer!123"
    Then UI shows the error message


