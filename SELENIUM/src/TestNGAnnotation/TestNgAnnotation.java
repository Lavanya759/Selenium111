package TestNGAnnotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	ChromeDriver driver=new ChromeDriver();
	@Test(enabled=false,invocationCount=2,dependsOnMethods="Register")
	public void login()
	{
		driver.get("https://demowebshop.tricentis.com/login");
	}
	@Test(priority=1,groups="smoke")
	public void Register()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
	}
	
	
	
}
