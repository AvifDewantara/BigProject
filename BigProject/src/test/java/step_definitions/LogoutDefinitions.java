package step_definitions;

import org.openqa.selenium.WebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.LogoutObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class LogoutDefinitions {
	public static WebDriver driver;

	public LogoutDefinitions() {
		driver = Hooks.driver;
	}
	@Given("User go to website \"(.*)\" as username and \"(.*)\" as password login1") 
	public void Login(String username, String password)throws Throwable {
		LogoutObject LogoutObject = new LogoutObject(driver);
		LogoutObject.setUsername(username);
		LogoutObject.setPassword(password);
		LogoutObject.clickLoginButton();
		
		Thread.sleep(3000);
		
		Assert.assertTrue(LogoutObject.isLoginSuccess());
	}
	@When("User in homepage and click logout button")
	public void clickwelcome()throws Throwable {
		LogoutObject LogoutObject = new LogoutObject(driver);
		LogoutObject.clickWelcomeButton();
		Thread.sleep(1000);
		LogoutObject.clickLogoutButton();
	}
	@Then("User logout")
	public void logout()throws Throwable{
		LogoutObject LogoutObject = new LogoutObject(driver);
		Assert.assertTrue(LogoutObject.isLogoutSuccess());
	}
}
