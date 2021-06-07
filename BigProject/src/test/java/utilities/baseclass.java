package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseclass {
	public static WebDriver webDriver;
	
	public baseclass(WebDriver webDriver) {
		baseclass.webDriver = webDriver;
	}

}