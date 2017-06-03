Feature: login with phone number
  As a RC user,
  I can log in with my phone number

  Scenario: super admin log in mobile client with extension number
    Given user has valid company ext number in RC with super admin permission
    When I input the company number,ext,password
    Then user should login success and can see super admin features

