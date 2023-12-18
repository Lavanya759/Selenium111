package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("Email")).sendKeys("lavanyasreddy214@gmail.com");
		driver.navigate().refresh();
		driver.findElement(By.id("Email")).sendKeys("lavanyasreddy217@gmail.com");
	}
}
