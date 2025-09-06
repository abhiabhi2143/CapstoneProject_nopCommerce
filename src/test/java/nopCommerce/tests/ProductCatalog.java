package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCatalog {
	WebDriver driver;
	
	public ProductCatalog(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnComputers()
	{
		driver.findElement(By.linkText("Computers")).click();
	}
	
	
	public void clickOnDesktops()
	{
		
		WebElement ele=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);

	}
	
	
	public void clickOnOneProduct()
	{
		driver.findElement(By.linkText("Build your own computer")).click();
	}
}
