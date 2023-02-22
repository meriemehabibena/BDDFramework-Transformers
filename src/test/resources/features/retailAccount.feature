Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'meriememary123@tekschool.us' and password'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'merieme' and Phone '7036565659'
    And User click on update button
    Then User profile information should be updated
