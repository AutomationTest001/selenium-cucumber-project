Feature: Login Functionality


@LoginValid_User
  Scenario: Test Case to verify Login functionality with valid username and password
    Given Browser should be open with login page
    When User should log-in using Username and Password
    And Click on Login button
    Then Home Page should get open and verify page title.
    And Close browser
