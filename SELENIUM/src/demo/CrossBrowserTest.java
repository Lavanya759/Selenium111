package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Also refer to the crossbrowser .xml


public class CrossBrowserTest {
	public ChromeDriver driver;//By default its value will be null
	@Parameters("Browser")
    @Test
public void demo(@Optional("chrome") String browserName) {//@optional represents the option.If test script is executed then chrome is exceuted otherwise if exceuted from.xml then the option provided there accordingingly it will be executed
	//String browserName="Chrome";
	if(browserName.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	/*else if(browserName.equals("msEdge"))
	{
		driver=new msEdgeDriver();
	}*/
	driver.get("https://demowebshop.tricentis.com/login");
	}
}
