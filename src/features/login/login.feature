Feature: Login

   Scenario: Forget password
     Given user forget password
     When user click the forget password button
     Then Forget password page displayed
