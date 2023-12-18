package Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BlassClass{
	ChromeDriver driver;
	@BeforeClass
	public void driverCreation() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void homeloginClick() {
	driver.get("https://demowebshop.tricentis.com/login");
	}
	@AfterMethod
	public void login()
	{
		driver.findElement(By.id("Email")).sendKeys("lavanyasreddy214@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Lavanya890!");
	}	
	@AfterClass
	public void driverClose() {
		driver.close();
	}
	
	
}
