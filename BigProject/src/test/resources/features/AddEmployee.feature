@AddEmployee
Feature: Adding employee in employee list

	@NegativeAdd
	Scenario: Add employee with invalid credentials
		Given User in homepage as someone1 using "Admin" as username and "s3Kol4HQA!*" as password
		When User navigate to add employee page and click save
		Then User receive error1 message, first name and last name is required
		
	@PostiveAdd
	Scenario: Add employee with valid credentials
		Given User login with "Admin" as username and "s3Kol4HQA!*" as password
		When User go to add employee page
		And User add "Firnanda" as first name, "Avif" as middle name and "Dewantara" as last name
		Then User created new employee