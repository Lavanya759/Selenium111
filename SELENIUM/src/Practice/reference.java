package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reference {
public reference(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}	
@FindBy(id="Email")
private WebElement emailTextField;

public WebElement getEmailTextField() {
	return emailTextField;
}



}
