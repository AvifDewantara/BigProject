package step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.AddEmployeeObject;
import Objects.AddEntitlementObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

public class AddEntitlementsDefinitions {
	public static WebDriver driver;

	public AddEntitlementsDefinitions() {
		driver = Hooks.driver;
	}
	//Negative Add Entitlements
		@Given("User signIn with \"(.*)\" as username and \"(.*)\" as password")
		public void Login(String username, String password) throws Throwable{
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.setUsername(username);
			AddEntitlementObject.setPassword(password);
			AddEntitlementObject.clickLoginButton();
			
			Thread.sleep(3000);
			
			Assert.assertTrue(AddEntitlementObject.isLoginSuccess());
		}
		@When("User Navigate to Entitlement page & click save button")
		public void NavToEntitlement()throws Throwable {
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.clickLeaveButton();
			Thread.sleep(1000);
			AddEntitlementObject.clickEntitlementButton();
			Thread.sleep(1000);
			AddEntitlementObject.clickAddEntitlementButton();
			Thread.sleep(1000);
			AddEntitlementObject.clickSaveButton();
			Thread.sleep(1000);
		}
		@Then("User cannot make Entitlement")
		public void cannotEntitlement()throws Throwable{
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.isError1Displayed();
			AddEntitlementObject.isError2Displayed();
		}
		//Positive Entitlement
		
		@Given("User log in with \"(.*)\" as username and \"(.*)\" as password")
		public void Login1(String username, String password) throws Throwable{
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.setUsername(username);
			AddEntitlementObject.setPassword(password);
			AddEntitlementObject.clickLoginButton();
			
			Thread.sleep(3000);
			
			Assert.assertTrue(AddEntitlementObject.isLoginSuccess());
		}
		@When("User go to Entitlement page")
		public void NavToEntitlement1()throws Throwable {
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.clickLeaveButton();
			Thread.sleep(1000);
			AddEntitlementObject.clickEntitlementButton();
			Thread.sleep(1000);
			AddEntitlementObject.clickAddEntitlementButton();
			Thread.sleep(1000);
		}
		@When("User input \"(.*)\" as Employee, \"(.*)\" as Entitlement, and click save button")
		public void insert(String Employeeusername, String Entitlement)throws Throwable {
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			AddEntitlementObject.setEmployeeUsername(Employeeusername);
			Thread.sleep(1000);
			AddEntitlementObject.setEntitlement(Entitlement);
			Thread.sleep(1000);
			AddEntitlementObject.clickSaveButton();
			Thread.sleep(5000);
		}
		@Then("User made Entitlement")
		public void madeEntitlement()throws Throwable {
			AddEntitlementObject AddEntitlementObject = new AddEntitlementObject(driver);
			Assert.assertTrue(AddEntitlementObject.isEntitlementSuccess());
			Thread.sleep(3000);
		}
}
