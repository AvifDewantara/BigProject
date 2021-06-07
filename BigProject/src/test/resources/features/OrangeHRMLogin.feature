@LoginPage
Feature: Login

  @Negative
  Scenario: Login with invalid Credential
    Given User in loginpage
    When User input "Admin1" as username1 & "s3Kol4HQA!" as password1 and user click login button
    Then User receive error message
    
  @Positive
  Scenario: Login with valid Credential
  	Given user in new loginpage
    When User input "Admin" as username & "s3Kol4HQA!*" as password and user click login button
    Then User redirected to OrangeHRM HomePage