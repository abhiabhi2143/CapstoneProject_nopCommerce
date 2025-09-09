package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.Register;
import testBase.BaseClass;
public class EndToEndRegister extends BaseClass {
	public static String registeredEmail; // shared variable
	 public static String registeredPassword;

	@Test(priority = 1)
	public void registrationTest() {
		try {
			HomePage hp = new HomePage(driver);
			hp.selectRegister();
			Register regPage = new Register(driver);

			// Instead of using excel, generate random test data
			String gender = "Male"; // or "Female"
			String firstName = randomString(); // e.g. "Abcde"
			String lastName = randomString(); // e.g. "Xyzab"
			String email = randomString() + "@gmail.com"; // e.g. "Tuvwz@gmail.com"
			String companyName = randomString() + " Pvt Ltd";
			String password = alphaNumeric(); // e.g. "Abc@123"

			regPage.selectGender(gender);
			regPage.setFirstName(firstName);
			regPage.setLastName(lastName);
			regPage.setEmail(email);
			regPage.setCompanyName(companyName);
			regPage.setPassword(password);
			regPage.setConfirmPassword(password);
			regPage.clickSubmit();

			Assert.assertTrue(regPage.isRegistrationSuccessMessageDisplayed(), "Registration failed with random data");
			EndToEndRegister.registeredEmail = email;
			EndToEndRegister.registeredPassword = password;
			System.out.println("Saved registered credentials -> email: " + email + " password: " + password);
			hp.selectLogout();
		} 
		catch (Exception e) 
		{
			Assert.fail("Exception occurred: " + e.getMessage());
		}
	}

}