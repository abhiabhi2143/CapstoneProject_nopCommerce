package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogin()
	{
		driver.findElement(By.linkText("Log in")).click();
	}
	
	public void enterCredentials() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("ram001@gmail.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("ram1234");
	}
	
	public void clickOnLoginSubmit()
	{
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
	}
}
