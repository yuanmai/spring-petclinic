Feature: Login

  Scenario: Reset password with incorrect previous password
    Given user has redirect to reset password page successfully
    When user reset password with input incorrect previous password
    Then UI shows the error message


