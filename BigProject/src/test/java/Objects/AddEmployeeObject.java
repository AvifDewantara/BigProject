package Objects;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeeObject {
	public WebDriver driver;
	public AddEmployeeObject(WebDriver driver) {
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
		
		@FindBy(xpath = "//b[.='PIM']")
		private WebElement BtnPIM;
		public void clickPIMButton() {
			BtnPIM.click();
		}
		
		@FindBy(id = "menu_pim_addEmployee")
		private WebElement BtnAddEmployee;
		public void clickAddButton() {
			BtnAddEmployee.click();
		}
		
		@FindBy(id = "btnSave")
		private WebElement btnSave;
		public void clickSaveButton() {
			btnSave.click();
		}
		
		@FindBy(xpath = "//ol[@class='fieldsInLine']/li[1]/span[@class='validation-error']")
		private WebElement ErrorFirstName;
		public boolean isError1Displayed() {
			ErrorFirstName.isDisplayed();
			return true;
		}
		
		@FindBy(xpath = "//ol[@class='fieldsInLine']/li[3]/span[@class='validation-error']")
		private WebElement ErrorLastName;
		public boolean isError2Displayed() {
			ErrorLastName.isDisplayed();
			return true;
		}
		
		@FindBy(id = "firstName")
		private WebElement InputFirstname;
		public void setFirstname(String Firstname) {
			InputFirstname.sendKeys(Firstname);
		}
		
		@FindBy(id = "middleName")
		private WebElement InputMiddlename;
		public void setMiddleName(String Middlename) {
			InputMiddlename.sendKeys(Middlename);
		}
		
		@FindBy(id = "lastName")
		private WebElement InputLastname;
		public void setLastName(String Lastname) {
			InputLastname.sendKeys(Lastname);
		}
		
		@FindBy(xpath = "//h1[.='Personal Details']")
		private WebElement PersonalDetails;
		public boolean isPersonalDetailsDisplayed() {
			PersonalDetails.isDisplayed();
			return true;
		}
}
	
