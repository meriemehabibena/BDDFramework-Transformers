Feature: Sign In Feature

  #this is comment
  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signInTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'test@test.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can login with different email and pass
    And User enter email <email> and password <password>
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                    | password    |
      | 'ihateteacher@tek.com'   | 'Tek@12345' |
      | 'panthers1@tekschool.us' | 'Tek@12345' |
      | 'panthers2@tekschool.us' | 'Tek@12345' |

  @signUpTest
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                       | password  | confirmPassword |
      | merieme | meriememary123@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
