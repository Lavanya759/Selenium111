package demo1;//Like a repository

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToReadDataFromProPertyFile {
	//step2
	public ToReadDataFromProPertyFile(ChromeDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//step1
	@FindBy(id="Email")
	private WebElement emailTextField;
	/*@FindBy(id="Password")
	private WebElement passWordTextField;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement Login;*/

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	/*public WebElement getPassWordTextField() {
		return passWordTextField;
	}
	public WebElement getLogin() {
		return Login;
	}*/
}
