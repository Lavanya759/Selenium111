package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/products_page/3");
		//String Parent_URL=driver.getWindowHandle();
		driver.findElement(By.name("compare")).click();
		Set <String> child=driver.getWindowHandles();
		for(String id:child)
		{
		driver.switchTo().window(id);
		if(driver.getCurrentUrl().contains("ebay"))
		{
			driver.manage().window().maximize();
		}
		}
		
	}
	

}
