package Practice;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shoppersstack.com/");
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\User\\Desktop\\Task\\image.png");
		FileHandler.copy(temp, dest);*/
		File temp=driver.findElement(By.xpath("//button[@id='loginBtn']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\User\\Desktop\\Task\\image.png");
		FileHandler.copy(temp, dest);
		WebElement e=driver.findElement(By.xpath("//button[@id='loginBtn']"));
		}
}








