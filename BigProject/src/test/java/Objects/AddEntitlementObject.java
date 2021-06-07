package Objects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEntitlementObject {
	public WebDriver driver;
	public AddEntitlementObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtUsername")
	private WebElement InputUsername;
	public void setUsername(String username) {
		InputUsername.sendKeys(username);
	}
	
	@FindBy(id = "txtPassword")
	private WebElement InputPassword;
	public void setPassword(String password) {
		InputPassword.sendKeys(password);
	}
	
	@FindBy(id = "btnLogin")
	private WebElement BtnLogin;
	public void clickLoginButton() {
		BtnLogin.click();
	}
	
	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboard;	
	public boolean isLoginSuccess() {
		dashboard.isDisplayed();
		return true;
	}
	
	@FindBy(xpath = "//b[.='Leave']")
	private WebElement BtnLeave;	
	public void clickLeaveButton() {
		BtnLeave.click();
	}
	
	@FindBy(id = "menu_leave_Entitlements")
	private WebElement BtnEntitlement;	
	public void clickEntitlementButton() {
		BtnEntitlement.click();
	}
	
	@FindBy(id = "menu_leave_addLeaveEntitlement")
	private WebElement BtnAddEntitlement;	
	public void clickAddEntitlementButton() {
		BtnAddEntitlement.click();
	}
	
	@FindBy(id = "btnSave")
	private WebElement btnSave;
	public void clickSaveButton() {
		btnSave.click();
	}
	
	@FindBy(id = "entitlements_employee_empName")
	private WebElement InputEmployeeUsername;
	public void setEmployeeUsername(String Employeeusername) {
		InputEmployeeUsername.sendKeys(Employeeusername);
		InputEmployeeUsername.sendKeys(Keys.ENTER);
	}

	@FindBy(id = "entitlements_entitlement")
	private WebElement InputEntitlement;
	public void setEntitlement(String Entitlement) {
		InputEntitlement.sendKeys(Entitlement);
	}
	
	@FindBy(xpath = "//form[@id='frmLeaveEntitlementAdd']//li[2]/span[@class='validation-error']")
	private WebElement requiredError;	
	public boolean isError1Displayed() {
		requiredError.isDisplayed();
		return true;
	}
	
	@FindBy(xpath = "//form[@id='frmLeaveEntitlementAdd']//li[5]/span[@class='validation-error']")
	private WebElement requiredError1;	
	public boolean isError2Displayed() {
		requiredError1.isDisplayed();
		return true;
	}
	
	@FindBy(id = "leave-entitlementsSearch")
	private WebElement EntitlementSearch;	
	public boolean isEntitlementSuccess() {
		EntitlementSearch.isDisplayed();
		return true;
	}
}
