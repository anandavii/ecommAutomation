Feature: User Login
  Scenario: Login with valid credentials
    Given User opens application homepage
    When User clicks on the MyAccount icon
    And User clicks on the Login option
    Then User should be navigated to the Login page
    When User enters email "testuser@myemail.com" and password "P@ssw0rd"
    And User clicks on the Login button
    Then User should be logged in successfully
    Then User clicks on the Logout Button