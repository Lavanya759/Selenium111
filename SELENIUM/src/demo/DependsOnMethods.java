package demo;

import static org.testng.Assert.fail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class DependsOnMethods {
	@Test
	public void login() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		}
@Test
public void register() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://shoppersstack.com/");
    Assert.fail();
}

}
