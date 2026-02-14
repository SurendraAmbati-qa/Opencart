package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	
	@Test(groups={"Sanity", "Master"})
	public void verify_login () {
		logger.info("*** Starting TC002_LoginTest***");
	try {	
		//HomePage
		HomePage hp = new HomePage(driver) ;
			hp.ClickMyAccount();
			hp.ClickLogin();
		
		//LoginPage	
		LoginPage lp = new 	LoginPage(driver);
			lp.EnterEmail(p.getProperty("email"));
			lp.EnterPassword(p.getProperty("password"));
			lp.ClickLogin();
		
		//MyAccount
		MyAccountPage MAP = new MyAccountPage(driver);
			boolean targetpage = MAP.isMyAccountPageExists();
			
			//Assert.assertEquals(targetpage, true, "LoginFailed");
			Assert.assertTrue(targetpage);
	}
	catch(Exception e) {
		Assert.fail();	
	}
	
	
	logger.info("***  Finished TC002_LoginTest***");

	}
	
	
	
	
	
	

}
