Feature: Login with Email
    As a RC User
    I want to login RC with Email credential

    Scenario: user happy path
      Given user has valid email account in RC
      When user enter correct credential
      Then user should login success


    Scenario: valid email, invalid password
      Given user has valid email account in RC
      When user enter correct email and invalid password
      Then user should login fail

    Scenario: not exist email
      Given email doesn't exist in RC system
      When  user enter an not exist email
      Then login fail and show "email not exist" alert

    Scenario: Network error
      Given user has valid email account in RC
      Given Network is not accessible
      When user enter credential
      Then login fail and show "Network error" alert





