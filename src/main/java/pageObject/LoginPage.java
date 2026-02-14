package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement linkEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement linkPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLoginClick;
	
	
	
	public void EnterEmail(String email) {
		linkEmail.sendKeys(email);
	}
	
	public void EnterPassword(String password) {
		linkPassword.sendKeys(password);
	}
	
	public void ClickLogin() {
		btnLoginClick.click();
	}
	
	

}
