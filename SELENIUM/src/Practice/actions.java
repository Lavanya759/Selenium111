package Practice;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/");
		WebElement wb=driver.findElement(By.xpath("//a[@id='men']"));
		Actions a=new Actions(driver);
		Thread.sleep(10000);
		a.moveToElement(wb);
	}
}
