package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Wishlist {
	
	WebDriver driver;
	
	public Wishlist(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchForAnotherProduct()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("Adobe Photoshop");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
	
	public void addToWishlist()
	{
		driver.findElement(By.xpath("//button[normalize-space()='Add to wishlist']")).click();
	}
}
