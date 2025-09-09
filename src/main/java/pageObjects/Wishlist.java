package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlist extends BasePage{

	//locators for wishlist
	
	public Wishlist(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement GoToWishlist;
	
	@FindBy(xpath="//button[@title='Add to wishlist']")
	WebElement AddToWishlist;
	
	@FindBy(xpath="//tbody/tr/td[@class='product']")
	List<WebElement> Products;

	//action methods
	
	public void addToWishlist() throws InterruptedException
	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo({ top: document.body.scrollHeight/2, behavior: 'smooth' });");

		Thread.sleep(3000);
		AddToWishlist.click();
	}
	
	public void goToWishlist()
	{
		GoToWishlist.click();
	}
	
	public void wishlistedProducts()
	{
		System.out.println("The Wishlisted Products are : ");
		for(WebElement prod: Products)
		{
			System.out.println(prod.getText());
		}
		System.out.println();
	}
	

}
