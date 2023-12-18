package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
@Test(priority=2,invocationCount=7,threadPoolSize=2,groups="smoke")//two browsers parallel execution
public void login() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://shoppersstack.com/");
	Reporter.log("user logged in successfully",true);//executed 7 times
}
@Test(priority=1,enabled=false,groups="smoke")//becz of enabled the test case is skipped without execution
public void register() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://shoppersstack.com/");
	Reporter.log("user registered successfully",true);//executed 1 time and given with first priority
 }
}
