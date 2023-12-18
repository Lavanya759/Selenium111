package demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerrImplementation extends listner implements ITestListener{
	public void onTestFailure(ITestResult result) {
    String time=LocalDateTime.now().toString().replace(":", "-");
	Reporter.log("Test Script failed",true);
    TakesScreenshot ts=(TakesScreenshot)driver;
    File temp=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshot/listner"+time+".png");
    try {
    	FileHandler.copy(temp, dest);
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    }
	}
    public void onTestSkipped(ITestResult result) {
		
	}

}
