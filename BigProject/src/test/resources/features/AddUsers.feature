@AddUser
Feature: adding user in system users

	@NegativeRegister
	Scenario: Register with Invalid credential
		Given User in homepage as someone using "Admin" as username and "s3Kol4HQA!*" as password
    When User navigates to add user page and User click save button
    Then User get error message
    
  @PositiveRegister
	Scenario: Register with valid credential
		Given User login homepage as someone using "Admin" as username1 and "s3Kol4HQA!*" as password1
    When User go to add userpage and User click save button
    And User input "karyawan New Cilsy" as employee name, "avif 103" as username,"Avif71*?" as password and "Avif71*?" as confirm password
    Then user created new account
