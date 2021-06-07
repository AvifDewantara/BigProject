package Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttendanceRecordsObject {
	public WebDriver driver;
	public AttendanceRecordsObject(WebDriver driver) {
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
	@FindBy(xpath = "//b[.='Time']")
	private WebElement BtnTime;
	public void clickTimeButton() {
		BtnTime.click();
	}
	
	@FindBy(id = "menu_attendance_Attendance")
	private WebElement BtnAttend;
	public void clickAttendanceButton() {
		BtnAttend.click();
	}
	
	@FindBy(id = "menu_attendance_viewMyAttendanceRecord")
	private WebElement BtnRecord;
	public void clickRecordButton() {
		BtnRecord.click();
	}
	
	@FindBy(id = "attendance_date")
	private WebElement InputDate;
	public void setDate(String Date) {
		InputDate.clear();
		InputDate.sendKeys(Date, Keys.ENTER);
	}
	
	@FindBy(id = "validationMsg")
	private WebElement ErrorDate;	
	public boolean isErrorDisplayed() {
		ErrorDate.isDisplayed();
		return true;
	}
	
	@FindBy(xpath = "//table[@class='table']")
	private WebElement Table;	
	public boolean isTableDisplayed() {
		Table.isDisplayed();
		return true;
	}
}
