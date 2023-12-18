package demo;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementationClass implements ITestListener{
    @Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
    	Reporter.log("Failed",true);
		
	}

  
	

}
