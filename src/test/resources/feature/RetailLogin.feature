Feature: Retail Page Feature

  Background: 
    Given user is on Retail website
    When user click on MyAccount
    And user click on Login option
    And user enter userName "Yaraan202235@aol.com"
    And User enter password "124578"
    And user click on login button
    Then user should be logged into myAccount dashboard

  @AffiliateRegisterUser
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | companyName | website           | taxID       | chequePayeeName | password | confirm password |
      | TEK         | www.tek-school.us | 85-12-20225 | TekSchool       |   258369 |           258369 |
    And User check on About us check box
    And User click on continue button
    And user should see a successfull message

  @EditAffiliateInformation
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName  | abaNumber | swiftCode | accountName | accountNumber |
      | ChaseBank |   2022445 |  00012510 | TEKCompany  |    4588866552 |
    And User click on Continue button
    Then User should see a success message "Congratulation! your account has been successfully updated."

 @EditAccount
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                      | telephone     |
      | Becca     | Loomis   | loomiMcbecca@tekschool.us | 7032223335050 |
    And User click on continue button
    Then User should see a message
