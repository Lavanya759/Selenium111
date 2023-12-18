package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	ChromeDriver driver;
	@Test
	public void login()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Logn");
		driver.findElement(By.id("Email")).sendKeys("lavanya");
	}
}
