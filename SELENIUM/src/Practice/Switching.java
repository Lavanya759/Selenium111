package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Switching {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10000);
		driver.navigate().to(new URL("https://shoppersstack.com/products_page/3"));
		//String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='compare']")).click();
		String parent=driver.getWindowHandle();
		Set <String> id=driver.getWindowHandles();
		id.remove(parent);
		for(String id1:id)
		{
			driver.switchTo().window(id1);
			if(driver.getCurrentUrl().contains("ebay"))
			{
			break;
			}
			else
				driver.close();
		}
		

	}

}
