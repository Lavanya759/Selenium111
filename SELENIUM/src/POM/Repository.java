package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Repository {
	public Repository(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailId;
	
	public WebElement getEmailId() {
		return emailId;
	}
	
}
