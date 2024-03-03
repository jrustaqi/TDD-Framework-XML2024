package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-check']") WebElement TICK_REMEMBER_ME_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-check']") WebElement UNTICK_REMEMBER_ME_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Forgot password?')]") WebElement FORGOT_PASSWORD_TEXT_ELEMENT;
	@FindBy(how = How.NAME, using ="email_or_username") WebElement EMAIL_USERNAME_FIELD_ELEMENT;
	@FindBy(how = How.NAME, using ="flag") WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Forgot password?')]") WebElement FORGOT_PASSWORD_TEXT_AGAIN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Remembered password?')]") WebElement REMEMBERED_PASSWORD_TEXT_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.ID, using ="login_submit") WebElement SIGNIN_BUTTON_ELEMENT;
	
	public void tickRememberMeBox() {
		TICK_REMEMBER_ME_BOX_ELEMENT.click();
	}
	
	public void unTickRememberMeBox() {
		UNTICK_REMEMBER_ME_BOX_ELEMENT.click();
	}
	
	public void clickOnForgotPassword() {
		FORGOT_PASSWORD_TEXT_ELEMENT.click();
	}
	
	public void insertEmailOrUsernameForForgotPassword(String EmailOrUsername) {
		EMAIL_USERNAME_FIELD_ELEMENT.sendKeys(EmailOrUsername);
	}
	
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
	
	public void clickAgainOnForgotPassword() {
		FORGOT_PASSWORD_TEXT_AGAIN_ELEMENT.click();
	}
	
	public void clickOnRememberedPassword() {
		REMEMBERED_PASSWORD_TEXT_ELEMENT.click();
	}
	
	public void insertUsername(String Username) {
		USERNAME_ELEMENT.sendKeys(Username);
	}
	
	public void insertPassword(String Password) {
		PASSWORD_ELEMENT.sendKeys(Password);
	}
	
	public void clickOnSinginButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	
	
	
}
