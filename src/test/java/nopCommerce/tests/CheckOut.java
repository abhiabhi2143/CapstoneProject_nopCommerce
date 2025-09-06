package nopCommerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOut {
	
	WebDriver driver;
	
	public CheckOut(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void agreeTerms()
	{
		driver.findElement(By.id("termsofservice")).click();
	}
	
	public void clickOnCheckout()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 100)");
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
	}
	
	public void billingAddressDetails() throws InterruptedException
	{
        
//        WebElement sort1=driver.findElement(By.id("BillingNewAddress_CountryId"));
//        Select sle1=new Select(sort1);
//        sle1.selectByVisibleText("India");
//        
//        sort1.sendKeys(Keys.TAB);
//        Thread.sleep(2000);
//        WebElement sort=driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
//        Select sle=new Select(sort);
//        sle.selectByIndex(2);
//        
//        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Rajahmundry");
//        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Mandapeta");
//        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("533308");
//        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9988776699");
        driver.findElement(By.cssSelector("button[name='save']")).click();
        Thread.sleep(2000);
        
	}
	public void shippingMethod()
	{
		WebElement ele= driver.findElement(By.xpath("//button[text()='Continue' and @class='button-1 shipping-method-next-step-button']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	public void paymentMethod()
	{
		driver.findElement(By.id("paymentmethod_0")).click(); 
        driver.findElement(By.xpath("//button[text()='Continue' and @name='save' and @class='button-1 payment-method-next-step-button']")).click();
	}
	
	public void paymentInformation()
	{
		driver.findElement(By.xpath("//button[text()='Continue' and @class='button-1 payment-info-next-step-button']")).click();
	}
	
	public void confirmCheckout() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
	}
}
