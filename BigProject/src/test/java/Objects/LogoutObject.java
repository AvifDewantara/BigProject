package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutObject {
	public WebDriver driver;
	public LogoutObject(WebDriver driver) {
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
	@FindBy(id = "welcome")
	private WebElement BtnWelcome;
	public void clickWelcomeButton() {
		BtnWelcome.click();
	}
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement BtnLogout;
	public void clickLogoutButton() {
		BtnLogout.click();
	}
	public boolean isLogoutSuccess() {
		InputUsername.isDisplayed();
		return true;
	}
}
