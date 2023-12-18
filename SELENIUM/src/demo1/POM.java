package demo1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class POM {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		ToReadDataFromProPertyFile lp=new ToReadDataFromProPertyFile(driver);
		lp.getEmailTextField().sendKeys("lavanyasreddy214@gmail.com");
        //lp.getPassWordTextField().sendKeys("lavanya75@");
        //lp.getLogin().click();
        //Thread.sleep(2000);
        
	}

}
