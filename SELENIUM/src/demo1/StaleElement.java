package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		ToReadDataFromProPertyFile lp=new ToReadDataFromProPertyFile(driver);
		//WebElement d=driver.findElement(By.id("Email"));
		//d.sendKeys("testing");
		lp.getEmailTextField().sendKeys("lavanyasreddy214@gmail.com");
		Thread.sleep(1000);
		driver.navigate().refresh();//Once after refreshing the driver control goes out
		//WebElement d1=driver.findElement(By.id("Email"));//rather than going for hard coding each and everytime after refersh go with pom
		//d1.sendKeys("7904945830");
		Thread.sleep(1000);
		lp.getEmailTextField().sendKeys("lavanyasreddy217@gmail.com");
		
		
		
		
		
	}

}
