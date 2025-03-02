Feature: My Account page post successful User Registration

  Scenario: User Navigates to the My Account page
    Given User is on My Account Page
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
