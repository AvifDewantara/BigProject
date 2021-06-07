package step_definitions;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.AttendanceRecordsObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class AttendanceRecordsDefinitions {
	public static WebDriver driver;

	public AttendanceRecordsDefinitions() {
		driver = Hooks.driver;
	}
	//InvalidDate
	@Given("User with \"(.*)\" as username and \"(.*)\" as password login") 
	public void Login(String username, String password)throws Throwable {
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		AttendanceRecordsObject.setUsername(username);
		AttendanceRecordsObject.setPassword(password);
		AttendanceRecordsObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AttendanceRecordsObject.isLoginSuccess());
	}
	@When("User go to Attendance record page and insert \"(.*)\" as invalid date")
	public void InvalidDate(String Date) throws Throwable{
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		AttendanceRecordsObject.clickTimeButton();
		Thread.sleep(1000);
		AttendanceRecordsObject.clickAttendanceButton();
		Thread.sleep(1000);
		AttendanceRecordsObject.clickRecordButton();
		Thread.sleep(1000);
		
		AttendanceRecordsObject.setDate(Date);
		
	}
	@Then("User receive invalid date error")
	public void InvalidDateError() throws Throwable{
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		Thread.sleep(1000);
		AttendanceRecordsObject.isErrorDisplayed();
	}
	//Valid Date
	@Given("User enter Website \"(.*)\" as username and \"(.*)\" as password")
	public void Login1(String username, String password)throws Throwable {
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		AttendanceRecordsObject.setUsername(username);
		AttendanceRecordsObject.setPassword(password);
		AttendanceRecordsObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AttendanceRecordsObject.isLoginSuccess());
	}
	@When("User navigate to Attendance record page and insert \"(.*)\" as valid date")
	public void ValidDate(String Date)throws Throwable{
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		AttendanceRecordsObject.clickTimeButton();
		Thread.sleep(1000);
		AttendanceRecordsObject.clickAttendanceButton();
		Thread.sleep(1000);
		AttendanceRecordsObject.clickRecordButton();
		Thread.sleep(1000);
		
		AttendanceRecordsObject.setDate(Date);
	}
	@Then("User get Attendance report result")
		public void ValidDateAssert() throws Throwable{
		AttendanceRecordsObject AttendanceRecordsObject = new AttendanceRecordsObject(driver);
		Thread.sleep(1000);
		AttendanceRecordsObject.isTableDisplayed();
	}
}
