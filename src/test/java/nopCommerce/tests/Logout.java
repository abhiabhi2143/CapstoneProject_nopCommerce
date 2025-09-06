package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
}
