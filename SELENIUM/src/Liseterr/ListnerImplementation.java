package Liseterr;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation extends BaseClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		Reporter.log("onfailed");
		
		
		
		
	}
	

}
