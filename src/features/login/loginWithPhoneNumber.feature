Feature: login with phone number
  As a RC user,
  I can log in with my phone number

  Scenario: super admin log in mobile client with extension number
    Given I am on mobile client login page
    When I input the correct company number,ext,password
    When I click login
    Then I am logged in and I can see super admin features

  Scenario: super admin log in mobile client with DID number
    Given I am on mobile client login page
    When I input the correct DID number,password
    When I click login
    Then I am logged in and I can see super admin features

  Scenario:  admin log in mobile client with extension number
    Given I am on mobile client login page
    When I input the correct company number,ext,password
    When I click login
    Then I am logged in and I can see admin features

  Scenario:  admin log in mobile client with DID number
    Given I am on mobile client login page
    When I input the correct DID number,password
    When I click login
    Then I am logged in and I can see admin features

  Scenario:  log in with wrong password
    Given I am on mobile client login page
    When I input the correct DID number,wrong password
    When I click login
    Then I can see error alert
