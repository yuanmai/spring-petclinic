Feature: Go to correct Page

  Scenario: Go to Email Login
    When user enter "ab@qq.com" and next
    Then user should go to email login page

  Scenario: Go to Phone Login

    When user enter "16502650531" and next
    Then user should go to phone login page
