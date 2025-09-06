package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	
	WebDriver driver;
	
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchForProduct()
	{   
		driver.findElement(By.id("small-searchterms")).sendKeys("MacBook");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}
	
}
