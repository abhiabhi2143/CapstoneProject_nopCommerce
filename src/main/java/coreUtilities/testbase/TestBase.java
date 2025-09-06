package coreUtilities.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demo.nopcommerce.com/");
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
	
	
	
	public void setUpReport()
	{
		
	}
	
	
	public void flushReport()
	{
		
	}
	
	
	
}
