package demo;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ConfigurationAnnotations {
	public class testn {
		@BeforeSuite
		public void beforeSuite() {
			Reporter.log("before Execution",true);
			}
		@Test
		public void test() {
			Reporter.log("test executed",true);
			}
	@Test
	public void sample() {
		Reporter.log("testng executed",true);
		}
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Execution",true);
		}
	@BeforeTest
	public void beforetest() {
		Reporter.log("BeforeTest Execution",true);
		}
	@AfterTest
	public void aftertest() {
		Reporter.log("AfterTest Execution",true);
		}


}
