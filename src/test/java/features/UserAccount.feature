Feature: My Account page post successful User Registration
  Scenario: User Navigates to the My Account page
    Given User is on My Account Page
    Then  User clicks on the myAccount Continue button
    Then User must see My Account label and following links
    |Edit your account information|
    |Change your password|
    |Modify your address book entries|
    |Modify your wish list           |
    Then User must see My Orders label and following links
    |View your order history|
    |Downloads              |
    |Your Reward Points     |
    |View your return requests|
    |Your Transactions        |
    |Recurring payments       |
    Then User must see My Affiliate Account label and following links
    |Register for an affiliate account|
    Then User must see Newsletter label and following links
    |Subscribe / unsubscribe to newsletter|
    Then User clicks on the Logout Button
