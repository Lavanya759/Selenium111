package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1{
@DataProvider
public String[][] datasender(){
	String[][] data={{"lavanyasreddy214@gmail.com","lavanya75@"},{"lavanyasreddy217@gmail.com","Lavanya752"}};
	return data;
}

@Test(dataProvider="datasender")
public void login(String[] credentials) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(credentials[0]);
	driver.findElement(By.id("Password")).sendKeys(credentials[1]);
}
}
