package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//locate elements
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Registelnk;
	
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement Loginlnk;
	
	
	//Action methods
	public void selectRegister() {
		Registelnk.click();
	}
	
	public void selectLogin()
	{
		Loginlnk.click();
	}
	
}
