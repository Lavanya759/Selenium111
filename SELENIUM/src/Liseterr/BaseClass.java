package Liseterr;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(ListnerImplementation.class)
public class BaseClass {
ChromeDriver driver;
@BeforeSuite
public void craetion()
{
	driver=new ChromeDriver();
}
@BeforeClass
public void login()
{
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@BeforeMethod
public void validate()
{
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Lon");
}
@AfterSuite
public void clos()
{
	driver.close();
}
}
