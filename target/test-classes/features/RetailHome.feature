Feature: This feature is use for testing UI of Retail page

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @smokeTest
  Scenario Outline: Verify Departement sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<departement>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | departement | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athetic Clothing               | Excercise & Fitness      |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItem
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'habibena111@hotmail.com' and password 'Ahmed2496$'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’

  
  Scenario: User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'habibena111@hotmail.com' and password 'Ahmed2496$'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2’
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | State    | ZipCode |
      | United States | RaiUSA   |  7034545459 | Tower Hill    |   1 | Alexandria | Virginia |   22315 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 9876543212345678 | RaiUSA     |               3 |           2026 |          321 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
