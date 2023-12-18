package demo;

import java.util.Set;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLaunchEmptyBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		/*driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
		{
		System.out.println("navigated");	
		}
		else
		{
			System.out.println("not navigated");	
		}
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		*/
		//driver.get("https://shoppersstack.com/products_page/3");
		/*driver.navigate().to(new URL("https://shoppersstack.com/products_page/3"));
		driver.manage().window().maximize();
		Thread.sleep(10000);*/
		/*driver.findElement(By.id("compare")).click();
	    Set<String> id=driver.getWindowHandles();
		Iterator i=id.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		/*driver.navigate().back();	
		driver.navigate().forward();
		driver.navigate().refresh();*/
		/*driver.get("https://shoppersstack.com/products_page/3");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		String parentId=driver.getWindowHandle();
		Set<String> id=driver.getWindowHandles();*/
		/*for(String i:id)
		{
		driver.switchTo().window(i);
		if(driver.getCurrentUrl().contains("ebay"))
		{
			driver.close();
		}
		if(driver.getCurrentUrl().contains("flipkart"))
		{
			driver.manage().window().maximize();
		}
		}*/
		/*id.remove(parentId);
		for(String i:id)
		{
			driver.switchTo().window(i);
			driver.close();
		}
		driver.switchTo().window(parentId);
		String title=driver.getTitle();
		System.out.println(title);*/
		/*driver.get("https://app.fireflink.com/signin");
		driver.findElement(By.id("mui-1")).sendKeys("lavanyasreddy214@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lavanya75@");
		driver.findElement(By.className("primary-btn")).click();*/
		//driver.get("https://shoppersstack.com/");
		//Thread.sleep(10000);
		//driver.findElement(By.partialLinkText("Men")).click();
		
		//driver.get("https://shoppersstack.com/");
		//Thread.sleep(10000);
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//driver.findElement(By.cssSelector("button[name='loginBtn']")).click();
		//driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		//driver.get("https://shoppersstack.com");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[contains(@id,'women')]")).click();
		//driver.findElement(By.xpath("//img[contains(@alt,'FOREVER 21')]"));
		
		
		//driver.get("file:///C:/Users/User/Desktop/tags_practice.html");
		//String text=driver.findElement(By.xpath("//td[contains(text(),'KGF')]/following-sibling::td")).getText();
		//System.out.println(text);
		
		
		/*
		driver.get("https://www.myntra.com/mobiles?rawQuery=mobiles");
		Thread.sleep(10000);
		WebElement res=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		res.sendKeys("tshirt" ,Keys.ENTER);
		*/
		
		/*driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(10000);
		WebElement res=driver.findElement(By.id("username"));
		res.clear();
		res.sendKeys("lavanya");
		WebElement res1=driver.findElement(By.id("password"));
		res1.clear();
		res1.sendKeys("lavanya890!");
		driver.findElement(By.xpath("//*[@id='loginFormDiv']/form/div[3]/button")).click();
		Thread.sleep(10000);
		WebElement res2=driver.findElement(By.xpath("(//span[contains(text(),'Invalid credentials')])[1]"));
		System.out.println(res2.getText());
		*/
		
		/*
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		*/
		
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		/*driver.get("https://www.skillary.io/en");
		Thread.sleep(10000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image1.png");
		FileHandler.copy(temp, dest);
		*/
		/*
		driver.get("https://www.skillrary.com/");
		File temp=driver.findElement(By.xpath("//*[@id=\"front-header\"]/div[3]/header/div/div/div[1]/div[1]/a")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image2.png");
		FileHandler.copy(temp, dest);
		*/
		/*
		LocalDateTime systime=LocalDateTime.now();
		String time=systime.toString().replace(":", "-");
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		File temp=driver.findElement(By.xpath("//*[@id=\"front-header\"]/div[3]/header/div/div/div[1]/div[1]/a")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/image2"+time+"png");
		FileHandler.copy(temp, dest);	
		*/
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		/*driver.get("https://www.shoppersstack.com/products_page/7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//*[@id='compare']")).click();
		*/
		/*
		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("Check Delivery")).sendKeys("560065");
		WebElement id=driver.findElement(By.xpath("//button[@id='Check']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(id));
		id.click();
		*/
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lavanya");
		WebElement hold=driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		act.clickAndHold(hold).perform();
		*/
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		Actions act=new Actions(driver);
		WebElement hold=driver.findElement(By.xpath("//button[@id='add']"));
		act.doubleClick(hold).perform();*/
		
		//WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.myntra.com/");
		Actions act=new Actions(driver);
		WebElement hold=driver.findElement(By.xpath("//a[text()='Beauty'][1]"));
		act.moveToElement(hold).perform();
		*/
		
		/*driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(5);
		WebElement src=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		*/
		/*driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert popup=driver.switchTo().alert();
		popup.accept();
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("hello");*/
		
		/*driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert confirmationPopUp=driver.switchTo().alert();
		System.out.println(confirmationPopUp.getText());
		confirmationPopUp.accept();
		System.out.println(confirmationPopUp.getText());
		confirmationPopUp.accept();
		*/
		/*driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert popup=driver.switchTo().alert();
		popup.accept();*/
		
		//driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		/*driver.get("https://www.makemytrip.com/");
		Thread.sleep(10000);
		WebElement fram=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/iframe"));
		driver.switchTo().frame(fram);
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		*/
		/*
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\Desktop\\Task\\ASSESSMENT_4.pdf");
		*/
		/*
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		settings.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(settings);
		driver.get("https://www.redbus.in/");
		*/
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		*/
		
		//WebDriver driver=new ChromeDriver();
		/*driver.get("https://shoppersstack.com/products_page/3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("compare")).click();
		Set<String> id=driver.getWindowHandles();
		for(String i:id)
		{
		driver.switchTo().window(i);
		String URL=driver.getCurrentUrl();
		if(URL.contains("amazon"))
		{
			break;
		}
		}
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		driver.close();*/
		/*driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
		WebElement mobile=driver.findElement(By.xpath("//span[text()='WhatsApp']"));
		js.executeScript("arguments[0].scrollIntoView(false)", mobile);
		*/
		/*driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement dr=driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[1]/div[2]/div/div[2]/form/div/input"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='heloo'", dr);
		*/
		
		/*
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-lbl='documentation-java21']")).click();
		WebElement we=driver.findElement(By.xpath("//a[@data-license='194']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", we);
		WebElement dr=driver.findElement(By.xpath("//*[@id=\"w11\"]/div/div[1]/div/div/div/form/div/div[2]/div"));
		js.executeScript("arguments[0].click()", dr);
	*/
		/*
		driver.get("https://demowebshop.tricentis.com/login");
		FileInputStream fis=new FileInputStream("./Files/common.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0]click()", we);
		*/
		
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		FileInputStream fis=new FileInputStream("./Files/Practice.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		LocalDateTime date=wb.getSheet("Practice").getRow(1).getCell(1).getLocalDateTimeCellValue();
		Month month=date.getMonth();
		int year=date.getDayOfYear();
		//int number=(int) wb .getSheet("Practice").getRow(1).getCell(1);
		System.out.println(month);
		System.out.println(year);
		//System.out.println(number);
		
		
	
	}	
	}

