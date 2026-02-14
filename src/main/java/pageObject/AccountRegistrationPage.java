package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	

	//input[@id='input-firstname']
	//input[@id='input-lastname']
	//input[@id='input-email']
	//input[@id='input-telephone']
	//input[@id='input-password']
	//input[@id='input-confirm']
	//input[@name='agree']
	//input[@value='Continue']
	
	@FindBy(xpath = "//input[@id='input-firstname']" )
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']" )
	WebElement txtLastName ;
	
	@FindBy(xpath = "//input[@id='input-email']" )
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']" )
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id='input-password']" )
	WebElement  txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']" )
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']" )
	WebElement CheckPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']" )
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']" )
	WebElement msgConfirmation;
	
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setTelephone(String Tel) {
		txtTelephone.sendKeys(Tel);
	}
	
	public void setPassword(String pwd){
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String Cpwd) {
		txtConfirmPassword.sendKeys(Cpwd);
	}
	
	public void setPrivacyPolicy(){
		CheckPolicy.click();
	}
	
	public void ClickContinue() {
		btnContinue.click();
	}
	
	
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
			}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
}

