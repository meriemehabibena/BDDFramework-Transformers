Feature: Retail Application Account Feature

  Scenario: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'habibena111@hotmail.com' and password 'Ahmed2496$'
    And User click on login button
    Then User should be logged in into Account

  #Scenario: Verify User can update Profile Information
  #When User click on Account option
  #And User update Name '' and Phone ''
  #And User click on update button
  #Then User profile information should be updated
  #Scenario: Verify User can Update password
  #When User click on Account option
  #And User enter below information
  #| previousPassword | newPassword | confirmPassword |
  #| Amen2496$        | Ahmed2496$  | Ahmed2496$      |
  #| Ahmed2496$       | Amen2496$   | Amen496$        |
  #And User click on Change Password button
  #Then a message should be displayed ‘Password Updated Successfully’
  #@AddPayment
  #Scenario: Verify User can add a payment method
  #When User click on Account option
  #And User click on Add a payment method link
  #And User fill Debit or credit card information
  #| cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
  #| 1234567890987654 | Rai        |               7 |           2023 |          123 |
  #And User click on Add your card button
  #Then a message should be displayed ‘Payment Method added successfully’
  #@EditPayment
  #Scenario: Verify User can edit Debit or Credit card
  #When User click on Account option
  #| cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
  #| 1234567890123456 | Rai        |               7 |           2026 |          321 |
  #And User click on Edit option of card section
  #And user edit information with below data
  #And user click on Update Your Card button
  #Then a message should be displayed ‘Payment Method updated Successfully’
  #@RemovePayment
  #Scenario: Verify User can remove Debit or Credit card
  #When User click on Account option
  #And User click on remove option of card section
  #Then payment details should be removed
  #@Address
  #Scenario: Verify User can add an Address
    #When User click on Account option
    #And User click on Add address option
    #And user fill new address form with below information
      #| country       | fullName | phoneNumber | streetAddress | apt | city      | State    | ZipCode |
      #| United States | RaiUSA   |  7036565659 | ColumbiaPike  | 901 | Arlington | Virginia |   22204 |
    #And User click Add Your Address button
    #Then a message should be displayed ‘Address Added Successfully’
#
  #@EditAddress
  #Scenario: Verify User can edit an Address added on account
    #When User click on Account option
    #And User click on edit address option
    #And user fill existing address form with new information
      #| country       | fullName   | phoneNumber | streetAddress | apt        | city       | State | ZipCode |
      #| United States | RaiMorocco |  7036565657 | Jamila HH     | Casablanca | Alexandria | Texas |   22315 |
    #And User click update Your Address button
    #Then a message should be displayed ‘Address Updated Successfully’
#
  #@RemoveAddress
  #Scenario: Verify User can remove Address from Account
    #When User click on Account option
    #And User click on remove option of Address section
    #Then Address details should be removed
