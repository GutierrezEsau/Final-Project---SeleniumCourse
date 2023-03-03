  Feature: Final Project
    Scenario: Buying the cheapest jacket
      Given I go to "https://magento.softwaretestingboard.com/"
      Then I click on Men section
      Then I click on Jackets
      Then I sort by Size
      Then I sort by price
      Then I add the first option to the cart
      Then Just wait 2000
      Then I select the size
      Then I select the color
      Then I add the quantity "1"
      Then I click on add to cart
      Then Just wait 2000
      Then I click on the Cart button
      Then I click on proceed to checkout
      Then I fill Email address "esaug@advancio.com"
      Then I fill Password "Perroazul12"
      Then I click Login
      Then Just wait 3000
      Then I click on item in cart
      Then I verify the Product "Beaumont Summit Kit"
      Then I verify the Quantity "1"
      Then I verify the Price "$42.00"
      Then I click on view details
      Then I verify the size "L"
      Then I verify the color "Orange"
      Then I click Next
      Then Just wait 3000
      Then I verify Cart Subtotal "$42.00"
      Then I verify Shipping "$5.00"
      Then I verify Order Total "$47.00"
      Then I verify the Product "Beaumont Summit Kit"
      Then I verify the Quantity "1"
      Then I verify the Price "$42.00"
      Then I click on view details
      Then I verify the size "L"
      Then I verify the color "Orange"
      Then I verify billing address and shipping address are the same
      Then Just wait 2000
      Then I click on Place Order
      Then Just wait 3000
      Then I click on my order number
      #Then I verify Product "Beaumont Summit Kit"
      #Then I verify Final Price "$42.00"
      #Then I verify Quantity "1"
      #Then I verify subtotal "$42.00"
      #Then I verify Size "L"
      #Then I verify Color "Orange"
      Then I verify Grand Total "$47.00"
      Then Just wait 3000

    Scenario: prueba
      Then I save the Order Number
      Then I create an account
      Then I fill the Password
      Then I fill the Confirm Password
      Then I click on Create an Account
      Then I click on View Order
      Then I verify the Order Number
      Then I click on Print Order
      Then I select Save as PDF
      Then I click on Save
      Then I click on Save
      Then I click on open the file
      Then I verify the Order Number








