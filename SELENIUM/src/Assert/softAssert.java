package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	ChromeDriver driver;
	@Test
	public void login()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Demo Web Shop. Logn","failed");
		driver.findElement(By.id("Email")).sendKeys("lavanya");
		sa.assertAll();
	}
}
