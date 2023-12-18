package Liseterr;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
@Test
public void login_click()
{
	driver.findElement(By.id("Email")).sendKeys("lavanyasreddy214@gmail.com");;
}
}
