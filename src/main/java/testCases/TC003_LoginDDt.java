package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDt extends BaseClass {
	
	
	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class, groups="DataDriver, ")//Getting data providers from different class
	
	public void veryfy_loginDDT(String email, String pwd, String exp ) 
	{
		logger.info("***Starting TC003_LoginDDT***");
		try 
		{
			//HomePage
			HomePage hp = new HomePage(driver) ;
				hp.ClickMyAccount();
				hp.ClickLogin();
			
			//LoginPage	
			LoginPage lp = new 	LoginPage(driver);
				lp.EnterEmail(email);
				lp.EnterPassword(pwd);
				lp.ClickLogin();
			
			//MyAccount
				Thread.sleep(4000);
			MyAccountPage MAP = new MyAccountPage(driver);
			
			boolean targetpage = MAP.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid")) 
			{
				if(targetpage==true) 
				{
					MAP.ClickLogout();
					Assert.assertTrue(true);
					
				}
			
				else 
				{ 
					Assert.assertTrue(false);
				}
			}
			if(exp.equalsIgnoreCase("Invalid")) 
			{
				if(targetpage==true) 
				{
					MAP.ClickLogout();
					Assert.assertTrue(false);
				}
			
				else 
				{
					Assert.assertTrue(true);
				}
			}
		} catch(Exception e)
		{
			Assert.fail();
		}
			logger.info("***Finished TC003_LoginDDT***");
	}	
}
