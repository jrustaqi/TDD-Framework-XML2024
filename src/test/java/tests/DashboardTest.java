package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class DashboardTest {
	
	WebDriver driver;

	String emailOrUsername;
	String userName;
	String password;
	String dashboardHeaderText;
	
	@Test
	public void userShouldBeAbleToClickOnCustomersAndAddCustomerMenus() throws InterruptedException {
	
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.tickRememberMeBox();
		Thread.sleep(2000);
		loginPage.unTickRememberMeBox();
		Thread.sleep(2000);
		loginPage.clickOnForgotPassword();
		Thread.sleep(2000);
		loginPage.insertEmailOrUsernameForForgotPassword(emailOrUsername);
		Thread.sleep(2000);
		loginPage.clickOnSubmitButton();
		Thread.sleep(2000);
		loginPage.clickAgainOnForgotPassword();
		Thread.sleep(2000);
		loginPage.clickOnRememberedPassword();
		Thread.sleep(2000);
		loginPage.insertUsername(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSinginButton();
		Thread.sleep(2000);

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDahsboardHeaderText(dashboardHeaderText);
		Thread.sleep(3000);

		dashboardPage.clickOnCustomersMenu();
		Thread.sleep(2000);

		dashboardPage.clickOnAddCustomerMenu();
		Thread.sleep(2000);
		
		//BrowserFactory.tearDown();
		
	}

}
