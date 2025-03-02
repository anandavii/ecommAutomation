Feature: New User Registration
  Scenario: Successful User Registration
    Given User opens application homepage
    When User clicks on the MyAccount icon
    And User clicks on the Register option
    Then User should be navigated to the Registration page
    When User enters the following registration details:
      | First Name | John    |
      | Last Name  | Doe     |
      | Telephone  | 1234567890 |
      | Password   | P@ssw0rd |
      | Confirm Password | P@ssw0rd |
    And User accepts the terms and conditions
    When User clicks on the Continue button
    Then User should see the registration successful message
    Then User verified after registration Continue button is displayed