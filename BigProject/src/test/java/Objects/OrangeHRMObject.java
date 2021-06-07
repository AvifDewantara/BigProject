package Objects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseclass;

public class OrangeHRMObject {
	public WebDriver driver;
	public OrangeHRMObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(id = "txtUsername")
	private WebElement InputUsername;
	
	@FindBy(id = "txtPassword")
	private WebElement InputPassword;

	@FindBy(id = "btnLogin")
	private WebElement BtnLogin;

	@FindBy(id = "spanMessage")
	private WebElement ErrorMessageLogIn;
	
	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboard;
	
	public boolean isLoginPageAppear() {
		InputUsername.isDisplayed();
		InputPassword.isDisplayed();
		BtnLogin.isDisplayed();
		return true;
	}
	
	public boolean isLoginSuccess() {
		dashboard.isDisplayed();
		return true;
	}

	public void setUsername(String username) {
		InputUsername.sendKeys(username);

	}

	public void setPassword(String password) {
		InputPassword.sendKeys(password);
	}

	public void setUsername1(String username1) {
		InputUsername.sendKeys(username1);

	}

	public void setPassword1(String password1) {
		InputPassword.sendKeys(password1);
	}

	public void clickLoginButton() {
		BtnLogin.click();
	}
	
	public boolean isErrorMessageAppear() {
		ErrorMessageLogIn.isDisplayed();
		
		return true;

	}
}
