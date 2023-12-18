package CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class compatability {	//refer parraltestng.xml
	WebDriver driver;
@Parameters("browser")
@Test
public void login(@Optional ("chrome") String browserName)//@Optional is not mandTORY
{
	
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equals("FireFox"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Reporter.log(browserName);
}
}
