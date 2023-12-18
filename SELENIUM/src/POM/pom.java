package POM;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class pom {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Repository r=new Repository(driver);
		r.getEmailId().sendKeys("lavanyasreddy214@gmail.com");
		Thread.sleep(1000);
		driver.navigate().refresh();
		r.getEmailId().sendKeys("lavanyasreddy217@gmail.com");
	}

}
