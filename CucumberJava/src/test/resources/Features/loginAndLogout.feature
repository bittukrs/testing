Feature: Login and Logout feature demo

  Background: 
    Given User is at the login page
    When User enters valid login credentials
    And User clicks on the login button
    Then Login should be successful

  @Login
  Scenario: To validate login with valid data
    Given User is at the login page
    When User enters the valid login credentials
    And User clicks on the login button
    Then Login should be successful

  @Logout
  Scenario: To verify the logout
    Given User is on the homepage
    When User clicks on the profile
    And User clicks on the logout button
    Then Logout should be successful

  Examples:
    | username               | password   |
    | raj@gmail.com          | raj098     |
    | rah2564@hotmail.com     | raj787     |
