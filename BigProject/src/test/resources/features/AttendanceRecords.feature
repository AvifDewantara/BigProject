@AttendanceRecords
Feature: Checking user Attendance Records

	@InvalidDate
		Scenario: Checking Attendance Records with invalid Date
		Given User with "Admin" as username and "s3Kol4HQA!*" as password login
		When User go to Attendance record page and insert "12-13-12" as invalid date
		Then User receive invalid date error
	
	@ValidDate
		Scenario: Checking Attendance Records with valid date
		Given User enter Website "Admin" as username and "s3Kol4HQA!*" as password
		When User navigate to Attendance record page and insert "2021-07-07" as valid date
		Then User get Attendance report result