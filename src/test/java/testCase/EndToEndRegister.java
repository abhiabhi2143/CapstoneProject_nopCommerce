package testCase;

import org.testng.annotations.Test;

import pageObjects.Register;
import testBase.BaseClass;

public class EndToEndRegister extends BaseClass{
	
	@Test
	public void regTest() throws InterruptedException
	{
		Register r=new Register(driver);
		r.clickOnRegister();
		r.selectGender("male");
		r.setFirstName("Abhi");
		r.setLastName("Ram");
		r.setEmail("ramuakgvjafj@gmail.com");
		r.setPassword("ram1234");
		r.setConfirmPassword("ram1234");
		r.clickOnRegisterSubmit();
		r.clickOnLogout();
	}
	
}
