package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class PoM {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		reference r=new reference(driver);
		r.getEmailTextField().sendKeys("lavanyasreddy");
		driver.close();
		

	}

}
