Feature: login with phone number
  As a RC user,
  I can log in with my phone number

  Scenario: super admin log in mobile client with extension number
    Given user has valid company ext number in RC with super admin permission
    When I input the company number,ext,password
    Then user should login success and can see super admin features


  Scenario: super admin log in mobile client with DID number
    Given user has valid DID number in RC with super admin features
    When I input the company DID number,password
    Then user should login success and can see super admin features

  Scenario:  admin log in mobile client with extension number
    Given user has valid company ext number in RC with  admin permission
    When I input the company number,ext,password
    Then user should login success and can see  admin features

  Scenario:  admin log in mobile client with DID number
    Given user has valid DID number in RC with  admin features
    When I input the company DID number,password
    Then user should login success and can see  admin features
