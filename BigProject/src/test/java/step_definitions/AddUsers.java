package step_definitions;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.AddUsersObject;
import Objects.OrangeHRMObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;


import org.junit.Assert;

public class AddUsers {
	public static WebDriver driver;
	
	public AddUsers()
	{
		driver = Hooks.driver;
	}
	
	@Given("User in homepage as someone using \"(.*)\" as username and \"(.*)\" as password")
	public void Login(String username, String password) throws Throwable{
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		AddUsersObject.setUsername(username);
		AddUsersObject.setPassword(password);
		AddUsersObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AddUsersObject.isLoginSuccess());
	}
	
	@When ("User navigates to add user page and User click save button")
	public void navigate_to_addpage() throws Throwable {
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		AddUsersObject.clickAdminButton();
		AddUsersObject.clickAddButton();
		AddUsersObject.clickSaveButton();
		
		Thread.sleep(3000);
	}
	
	@Then ("User get error message")
	public void error() {
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		Assert.assertTrue(AddUsersObject.isErrorDisplayed());
		Assert.assertTrue(AddUsersObject.isError1Displayed());
	}
	
	//CreateAccount
	@Given("User login homepage as someone using \"(.*)\" as username1 and \"(.*)\" as password1")
	public void Login1(String username, String password) throws Throwable{
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		AddUsersObject.setUsername(username);
		AddUsersObject.setPassword(password);
		AddUsersObject.clickLoginButton();
		
		
		Thread.sleep(3000);
		
		Assert.assertTrue(AddUsersObject.isLoginSuccess());
	}
	@When ("User go to add userpage and User click save button")
	public void navigate_to_addpage1() throws Throwable {
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		AddUsersObject.clickAdminButton();
		AddUsersObject.clickAddButton();
		
		Thread.sleep(3000);
	}
	@When ("User input \"(.*)\" as employee name, \"(.*)\" as username,\"(.*)\" as password and \"(.*)\" as confirm password")
	public void insert_credentials(String Employee, String RegUsername, String RegPassword, String setConfirm)throws Throwable {
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		AddUsersObject.setEmployee(Employee);
		AddUsersObject.setRegUsername(RegUsername);
		AddUsersObject.setRegPassword(RegPassword);
		AddUsersObject.setConfirm(setConfirm);
		
		Thread.sleep(3000);
		
		AddUsersObject.clickSaveButton();
		
		Thread.sleep(10000);
	}
	@Then ("user created new account")
	public void Acc() throws Throwable {
		AddUsersObject AddUsersObject = new AddUsersObject(driver);
		
		Thread.sleep(3000);
	}
}
