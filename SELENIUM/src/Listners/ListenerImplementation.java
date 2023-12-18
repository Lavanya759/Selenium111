package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BlassClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		Reporter.log("Failed",true);
	}
	

}
