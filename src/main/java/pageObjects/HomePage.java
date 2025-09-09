package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locator for registration
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement Registelnk;
	
	//locator for registration
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement logoutLnk;
	
	//locator for log in
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement logInLnk;
	
	//Action method
	public void selectRegister() {
		Registelnk.click();
	}
	
	public void selectLogout() {
		logoutLnk.click();
	}
	
	public void selectLogin() {
		logInLnk.click();
	}
	
}
