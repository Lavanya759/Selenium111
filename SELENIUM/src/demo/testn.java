package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testn {
	@Test(groups="smoke")
	public void test() {
		Reporter.log("test executed",true);
		}
@Test
public void sample() {
	Reporter.log("testng executed",true);
	}
}

