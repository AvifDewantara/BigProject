package Objects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUsersObject {
	public WebDriver driver;
	public AddUsersObject(WebDriver driver) {
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

	@FindBy(xpath = "//b[.='Admin']")
	private WebElement BtnAdmin;	
	public void clickAdminButton() {
		BtnAdmin.click();
	}
	
	@FindBy(id = "btnAdd")
	private WebElement BtnAdd;
	public void clickAddButton() {
		BtnAdd.click();
	}
	
	@FindBy(id = "btnSave")
	private WebElement btnSave;
	public void clickSaveButton() {
		btnSave.click();
	}
	@FindBy(xpath = "//span[.='Employee does not exist']")
	private WebElement EmployeeError;	
	public boolean isErrorDisplayed() {
		EmployeeError.isDisplayed();
		return true;
	}
	@FindBy(xpath = "//span[.='Required']")
	private WebElement Required;	
	public boolean isError1Displayed() {
		Required.isDisplayed();
		return true;
	}
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement InputEmployee;
	public void setEmployee(String Employee) {
		InputEmployee.sendKeys(Employee);
		InputEmployee.sendKeys(Keys.ENTER);
	}
	
	@FindBy(id = "systemUser_userName")
	private WebElement InputRegUsername;
	public void setRegUsername(String RegUsername) {
		InputRegUsername.sendKeys(RegUsername);
	}
	
	@FindBy(id = "systemUser_password")
	private WebElement InputRegPassword;
	public void setRegPassword(String RegPassword) {
		InputRegPassword.sendKeys(RegPassword);
	}
	@FindBy(id = "systemUser_confirmPassword")
	private WebElement InputConfirm;
	public void setConfirm(String setConfirm) {
		InputConfirm.sendKeys(setConfirm);
	}
}
