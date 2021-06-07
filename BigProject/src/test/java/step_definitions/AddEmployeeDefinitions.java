package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.AddEmployeeObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class AddEmployeeDefinitions {
	public static WebDriver driver;

	public AddEmployeeDefinitions() {
		driver = Hooks.driver;
	}
	
	//Negative Add Employee
	@Given("User in homepage as someone1 using \"(.*)\" as username and \"(.*)\" as password")
	public void Login(String username, String password) throws Throwable{
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		AddEmployeeObject.setUsername(username);
		AddEmployeeObject.setPassword(password);
		AddEmployeeObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AddEmployeeObject.isLoginSuccess());
	}
	@When("User navigate to add employee page and click save")
	public void navigate_to_add_employee_page() throws Throwable {
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		AddEmployeeObject.clickPIMButton();
		AddEmployeeObject.clickAddButton();
		Thread.sleep(3000);
		AddEmployeeObject.clickSaveButton();
		
		Thread.sleep(3000);

	}
	@Then("User receive error1 message, first name and last name is required")
	public void ErrorMessage() throws Throwable {
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		
		Assert.assertTrue(AddEmployeeObject.isError1Displayed());
		Assert.assertTrue(AddEmployeeObject.isError2Displayed());
	}
	//Positive Add Employee
	@Given("User login with \"(.*)\" as username and \"(.*)\" as password")
	public void Login1(String username, String password) throws Throwable{
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		AddEmployeeObject.setUsername(username);
		AddEmployeeObject.setPassword(password);
		AddEmployeeObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AddEmployeeObject.isLoginSuccess());
	}
	@When("User go to add employee page")
	public void navigate_to_add_employee_page1() throws Throwable {
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		AddEmployeeObject.clickPIMButton();
		AddEmployeeObject.clickAddButton();
		
		Thread.sleep(3000);

	}
	@When("User add \"(.*)\" as first name, \"(.*)\" as middle name and \"(.*)\" as last name")
	public void InsertName(String Firstname, String Middlename, String Lastname) throws Throwable {
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		AddEmployeeObject.setFirstname(Firstname);
		Thread.sleep(1000);
		AddEmployeeObject.setMiddleName(Middlename);
		Thread.sleep(1000);
		AddEmployeeObject.setLastName(Lastname);
		
		Thread.sleep(3000);
		AddEmployeeObject.clickSaveButton();
	}
	@Then("User created new employee")
	public void CreatedEmployee()throws Throwable{
		AddEmployeeObject AddEmployeeObject = new AddEmployeeObject(driver);
		Thread.sleep(3000);
		
		Assert.assertTrue(AddEmployeeObject.isPersonalDetailsDisplayed());
		
		Thread.sleep(3000);
	}
}
