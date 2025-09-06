package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnRegister() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
	}
	
	public void fillRegisterDetails() throws InterruptedException
	{
		 driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Abhi");
	     driver.findElement(By.id("LastName")).sendKeys("Ram");
	     driver.findElement(By.id("Email")).sendKeys("ram001@gmail.com");
	     driver.findElement(By.id("Password")).sendKeys("ram1234");
	     driver.findElement(By.id("ConfirmPassword")).sendKeys("ram1234");
	}
	
	public void clickOnRegisterSubmit()
	{
		driver.findElement(By.id("register-button")).click();
	}
	
	
	
}
