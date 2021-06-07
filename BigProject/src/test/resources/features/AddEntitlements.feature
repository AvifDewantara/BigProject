@AddEntitlement
Feature: adding entitlement to employee

  @NegativeEntitlements
    Scenario: Add Entitlement with invalid Employee Entitlement
    Given User signIn with "Admin" as username and "s3Kol4HQA!*" as password
    When User Navigate to Entitlement page & click save button
    Then User cannot make Entitlement
    
	@PositiveEntitlements
		Scenario: Add Enititlement with valid Employee Entitlement
		Given User log in with "Admin" as username and "s3Kol4HQA!*" as password
		When User go to Entitlement page
		And User input "Firnanda Avif Dewantara" as Employee, "123" as Entitlement, and click save button
		Then User made Entitlement