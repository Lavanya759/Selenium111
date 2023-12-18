package TestNGAnnotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice1 {
	ChromeDriver driver=new ChromeDriver();
	@Test(enabled=false,invocationCount=2,dependsOnMethods="Register",groups="smoke")
	public void login()
	{
		driver.get("https://demowebshop.tricentis.com/login");
	}
	@Test(priority=1)
	public void Register()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
	}
}
