package stepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Common_stepDef {

	HomePage homePage;
	LoginPage loginPage;

	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() throws IOException {

		// driver = Hooks.driver;
		homePage = new HomePage(Hooks.driver);
	}

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {

		homePage = new HomePage(Hooks.driver);
		homePage.clickSignIn();

	}

	@When("user enters sheet {string} and {int}")
	public void user_enters_sheet(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		loginPage = new LoginPage(Hooks.driver);
		loginPage.enterExcelDataForLogin(sheetname, rownumber);
		
	}
	
	@When("^user enters (.*) and (.*) on Login page$")
	public void user_enters_username_and_password_on_login_page(String username, String password) {
		loginPage = new LoginPage(Hooks.driver);
		loginPage.enterDataForLogin(username, password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginBtn();
	}

}
