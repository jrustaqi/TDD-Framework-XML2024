package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AddNewCustomerPage;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddNewCustomerTest extends BasePage{

	WebDriver driver;
	
	String userName;
	String password;
	String dashboardHeaderText;
	String newCustomerHeaderText;
	String fullName;
	String companyName;
	String email;
	String phone;
	String address;
	String city;
	String zipCode;
	String country;
	String group;
	
	@Test
	@Parameters({"username", "password", "dashboardHeaderText", "newCustomerHeaderText", "fullname", "company", "email", "phone", "address", "city", "zip", "country", "group"})
	public void userShuldBeAbleToAddNewCustomer(String userName, String password, String dashboardHeaderText, String newCustomerHeaderText, String fullName, String companyName, String email, String phone, String address, String city, String zipCode, String country, String group) throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		Thread.sleep(2000);
		takeScreenshot(driver);
		
		loginPage.insertUsername(userName);
		Thread.sleep(2000);
		
		loginPage.insertPassword(password);
		Thread.sleep(2000);
		
		loginPage.clickOnSinginButton();
		Thread.sleep(2000);

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
		dashboardPage.validateDahsboardHeaderText(dashboardHeaderText);
		Thread.sleep(3000);
		takeScreenshot(driver);
		
		dashboardPage.clickOnCustomersMenu();
		Thread.sleep(2000);

		dashboardPage.clickOnAddCustomerMenu();
		Thread.sleep(2000);
		
		AddNewCustomerPage addNewCustomerPage = PageFactory.initElements(driver, AddNewCustomerPage.class);
		
		addNewCustomerPage.validateAddCustomerPage(newCustomerHeaderText);
		Thread.sleep(2000);
		takeScreenshot(driver);
		
		addNewCustomerPage.insertFullname(fullName);
		Thread.sleep(2000);	
		addNewCustomerPage.selectCompanyfromDropDown(companyName);
	
		addNewCustomerPage.insertEmail(email);
		
		addNewCustomerPage.insertPhone(phone);
		
		addNewCustomerPage.insertAddress(address);
		
		addNewCustomerPage.insertCity(city);
		
		addNewCustomerPage.insertZipCode(zipCode);
		
		addNewCustomerPage.selectCountryFromDropDown(country);
		
		addNewCustomerPage.selectGroupFromDropDown(group);
		
		addNewCustomerPage.clickOnSaveButton();
		
		addNewCustomerPage.validateInsertedCustomer();
		Thread.sleep(2000);
		takeScreenshot(driver);
		
		
		//BrowserFactory.tearDown();
	}
}
