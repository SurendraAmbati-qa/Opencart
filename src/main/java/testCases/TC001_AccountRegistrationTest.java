package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	//WebDriver driver;
	
	@Test (groups = {"Regression", "Master"})
	public void Verify_Account_Registration() {
		
		try {
			
		
		logger.info("**Test is Started***");
		
		
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("**Click in My account***");
		hp.ClickRegister();
		logger.info("**Click in Register***");
		
		AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
		
		logger.info("**Providing the customer details**");
		regPage.setFirstName(randomString().toUpperCase());
		regPage.setLastName(randomString().toUpperCase());
		
		regPage.setEmail(randomString()+"@gmail.com");
		regPage.setTelephone(randomNumber());
		String PassWord = randomAlphaNumeric();
		regPage.setPassword(PassWord);
		regPage.setConfirmPassword(PassWord);
		
		regPage.setPrivacyPolicy();
		regPage.ClickContinue();
		
		logger.info("Validating the expected message");
		String conmsg = regPage.getConfirmationMsg();
		if(conmsg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);			
		}
		else {
			logger.error("Test Failed.......");
			logger.debug("Debug logs........");
			Assert.assertTrue(false);
		}
		
		Assert.assertEquals(conmsg, "Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
			
		}
		logger.info("....Finished TC001.............");
	}
		
	}	
	
		
		
		

