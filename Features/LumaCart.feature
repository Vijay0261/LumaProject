Feature: Add Items To Cart in Luma Application

  Scenario: Add Mens Tops Jackshirt To Cart
    Given I Log in to luma application with valid og in details"<emailid>"and"<password>"
    And i navigate to jackshirt page
    When I Select Jacket of"<size>"and"<colour>"
    And click on add to cart button
    Then cart should be updated

    Examples: 
      | emailid                      | password    | size | colour |
      | vijaychintanippula@gmail.com | welcome123! | L    | Blue   |
