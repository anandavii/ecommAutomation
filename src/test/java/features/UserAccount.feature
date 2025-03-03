Feature: My Account page post successful User Registration

  Scenario: User Navigates to the My Account page
    Given User opens application homepage
    When User clicks on the MyAccount icon
    And User clicks on the Login option
    Then User should be navigated to the Login page
    When User enters email "testceb4c05b-3bb6-42de-a1bf-a7bc6034a38a@myemail.com" and password "P@ssw0rd"
    And User clicks on the Login button
    Then User should be logged in successfully
    # Verifying Labels on the My Account page
    Then User must see the following labels on the My Account page
      | My Account        |
      | My Orders        |
      | My Affiliate Account |
      | Newsletter       |

    # Verifying Links under My Account section
    Then User must see My Account label and following links
      | Edit your account information |
      | Change your password          |
      | Modify your address book entries |
      | Modify your wish list          |

    # Verifying Links under My Orders section
    Then User must see the following links under My Orders section
      | View your order history |
      | Downloads              |
      | Your Reward Points     |
      | View your return requests |
      | Your Transactions       |
      | Recurring payments      |

    # Verifying Links under My Affiliate Account section
    Then User must see the following links under My Affiliate Account section
      | Register for an affiliate account |

    # Verifying Links under Newsletter section
    Then User must see the following links under Newsletter section
      | Subscribe / unsubscribe to newsletter |

    # Logout from My Account page
    Then User clicks on the Logout Button
