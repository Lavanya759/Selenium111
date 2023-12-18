package Listners;

import java.time.Duration;

import org.testng.annotations.Test;

public class TestScript extends BlassClass {
	@Test
	public void Actual()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}

