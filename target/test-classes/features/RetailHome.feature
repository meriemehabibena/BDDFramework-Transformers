Feature: This feature is use for testing UI of Retail page

  @test @smoke @regression
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displaye

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
