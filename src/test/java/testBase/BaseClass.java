package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BaseClass {

	public WebDriver driver;
	Properties p;
	@BeforeClass
	public void setUp() throws Exception {
		//Loading cofig.properties file
		driver = new ChromeDriver();
		FileReader file = new FileReader("C:\\Eclipse\\CapstoneProject\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));//reading url from properties file
			
		driver.manage().window().maximize();
				
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
				
	}
			
			/*@AfterClass
			public void tearDown() {
				driver.quit();
			}	*/
		
	
	public String captureScreen(String testName) {
	    try 
	    {
	        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
	        String timeStamp = df.format(new Date(0));

	        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

	        String targetDir = System.getProperty("user.dir") + File.separator + "Screenshots";
	        File dir = new File(targetDir);
	        if (!dir.exists()) dir.mkdirs();

	        String targetFilePath = targetDir + File.separator + testName + "_" + timeStamp + ".png";
	        File targetFile = new File(targetFilePath);

	        FileUtils.copyFile(sourceFile, targetFile);  // safer than renameTo
	        return targetFilePath;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
		
	}
	}