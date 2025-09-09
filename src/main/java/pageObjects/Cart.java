package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends BasePage{

	public Cart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	WebElement AddToCart;
	
	@FindBy(xpath="//span[@class='cart-label']")
	WebElement ShoppingCartBtn;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement CheckoutBtn;
	
	@FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
	WebElement addingProductTocartBtn;
	
	
	//action methods
	public void clickShoppingCartBtn() {
		ShoppingCartBtn.click();
	}
	
	public void clickCheckoutBtn() {
		CheckoutBtn.click();
	}
	
	public void addToCart() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });");
		Thread.sleep(3000);
		AddToCart.click();
	}
	
	public void  clickaddingProductTocartBtn() {
		addingProductTocartBtn.click();
	}
}