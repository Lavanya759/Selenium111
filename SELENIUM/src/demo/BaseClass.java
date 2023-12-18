package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
@BeforeClass
public void beforeClass()
{
	driver=new ChromeDriver();
	driver.get("https://shoppersstack.com/");
	Reporter.log("open browser and navigate to url");
}
@AfterClass
public void afterClass() {
	driver.quit();
	Reporter.log("Close the browser");
}
}

}
