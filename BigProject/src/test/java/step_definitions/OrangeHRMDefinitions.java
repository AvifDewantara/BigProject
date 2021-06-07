package step_definitions;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.OrangeHRMObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;

import org.junit.Assert;

public class OrangeHRMDefinitions {
	public static WebDriver driver;
	
	public OrangeHRMDefinitions()
	{
		driver = Hooks.driver;
	}
	
	@Given("User in loginpage")
	public void i_am_in_loginpage() throws Throwable{
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		Assert.assertTrue(OrangeHRMObject.isLoginPageAppear());
	}
	
	@When ("User input \"(.*)\" as username1 & \"(.*)\" as password1 and user click login button")
	public void input_credential(String username1, String password1) throws Throwable {
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		OrangeHRMObject.setUsername1(username1);
		OrangeHRMObject.setPassword1(password1);
		OrangeHRMObject.clickLoginButton();
		
		Thread.sleep(3000);
	}
	
	@Then ("User receive error message")
	public void error() {
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		Assert.assertTrue(OrangeHRMObject.isErrorMessageAppear());
	}
	
	@Given("user in new loginpage")
	public void i_am_in_new_loginpage() throws Throwable{
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		Assert.assertTrue(OrangeHRMObject.isLoginPageAppear());
	}
	@When ("User input \"(.*)\" as username & \"(.*)\" as password")
	public void input_credential1(String username, String password) throws Throwable {
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		OrangeHRMObject.setUsername(username);
		OrangeHRMObject.setPassword(password);
		OrangeHRMObject.clickLoginButton();
		
		Thread.sleep(3000);
	}
	@Then ("User redirected to OrangeHRM HomePage")
	public void redirect() {
		OrangeHRMObject OrangeHRMObject = new OrangeHRMObject(driver);
		Assert.assertTrue(OrangeHRMObject.isLoginSuccess());
	}
}
