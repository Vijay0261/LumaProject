Feature: Add Items To Cart in Luma Application

  Scenario Outline: User adds a mens jackshirt product to the cart
    Given the user is on the Luma login page to login with valid details "<emailid>" and "<password>"
    When the user navigates to the Men jackshirtpage
    And the user selects a product with "<size>" and "<colour>"
    And the user adds the product to the cart
    Then the product should be added to the cart successfully

    Examples: 
      | emailid                      | password    | size | colour |
      | vijaychintanippula@gmail.com | welcome123! | xs   | Green   |
