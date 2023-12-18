package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class listner {
	public static WebDriver driver;
	
	@BeforeClass
	public void browserSetUp()
	{
		driver=new ChromeDriver();
	}
}
