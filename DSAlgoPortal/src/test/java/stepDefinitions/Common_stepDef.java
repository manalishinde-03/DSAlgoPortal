package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class Common_stepDef {

	HomePage homePage;
	LoginPage loginPage;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;

	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() throws IOException {
		
		driver = driverFactory.getDriver();
		homePage = new HomePage(driver);
		System.out.println("user_navigates_to_home_page >>>>>Thread ID :"+Thread.currentThread().threadId());
	}

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {
		homePage.clickSignIn();
		System.out.println("Thread ID :"+Thread.currentThread().threadId());
	}

	@When("user enters sheet {string} and {int}")
	public void user_enters_sheet(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		driver = driverFactory.getDriver();
		loginPage = new LoginPage(driver);
		loginPage.enterExcelDataForLogin(sheetname, rownumber);
	}
	
	@When("^user enters (.*) and (.*) on Login page$")
	public void user_enters_username_and_password_on_login_page(String username, String password) {
		driver = driverFactory.getDriver();
		loginPage = new LoginPage(driver);
		loginPage.enterDataForLogin(username, password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginBtn();
	}

}
