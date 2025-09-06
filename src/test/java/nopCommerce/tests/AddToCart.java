package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	WebDriver driver;
	
	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
	}
	
	
	public void goToCart()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='cart-label']"));
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void retrieveProductData() throws InterruptedException
	{
		Thread.sleep(3000);
		String prodData=driver.findElement(By.xpath("//table[@class='cart']")).getText();
		System.out.println(prodData);
	}
}
