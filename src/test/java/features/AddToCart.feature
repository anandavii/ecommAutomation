Feature: Add a product to the shopping cart
  Scenario: User adds MacBook Air to the cart and verifies details
    Given User opens application homepage
    When User searches for "MacBook"
    And User adds "MacBook Air" priced at "$1,202.00" to the cart
    Then User should see a success message "Success: You have added MacBook Air to your shopping cart!"
    When User clicks on the cart button
    And User clicks on "View Cart" from the cart pop-up
    Then User should be on the Shopping Cart page
    And User verifies the following product details in the cart:
      | Product Name  | Model | Quantity |Price|
      | MacBook Air   |Product 17| 1|$1,000.00  |
    Then User clicks on the MyAccount icon
    Then User clicks on the Logout option
