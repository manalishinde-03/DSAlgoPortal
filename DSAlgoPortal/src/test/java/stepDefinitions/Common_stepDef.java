package stepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelReader;

public class Common_stepDef {

	HomePage homePage;
	LoginPage loginPage;

	CommonPage commonPage;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;

	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() throws IOException {
		driver = driverFactory.getDriver();
		this.homePage = new HomePage(driver);
	}

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {

		homePage.clickSignIn();

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

	@And("user clicks tryhere button")
	public void graph_user_clicks_tryhere_button() {
		driver = driverFactory.getDriver();
		commonPage=new CommonPage(driver);
		this.commonPage.click_tryhere_with_timeout(driver, 20);
	}
	@Then("user should be directed to tryEditor write non python code and clicks run button")
	public void graph_user_should_be_directed_to_try_editor_write_non_python_code_and_clicks_run_button() {
		this.commonPage.try_python_script(driver, "Hello World");
		//this.commonPage.driver.navigate().back();// negative test.. it should fail
	}

	@And("user write python code and clicks run button and it will display output")
	public void graph_user_write_python_code_and_clicks_run_button_and_it_will_display_output() {
		this.commonPage.click_tryhere_with_timeout(driver, 10);
		this.commonPage.try_python_script(driver, "print('Hello World')");
	}
	@Then("user executes code from  sheetname {string} and row number {int}")
	public void datadriven_tryeditor(String sheetname,int row)throws InvalidFormatException, IOException  {
		this.commonPage.try_python_script_excel(sheetname,row);
		//this.commonPage.driver.navigate().back();// negative test.. it should fail
	}

	
//	@Then("user goes to previous page")
//	public void graph_user_goes_to_previous_page() {
//		driver = driverFactory.getDriver();
//		//this.CommonPF.driver.navigate().back();
//	
//		this.commonPage.driver.navigate().back();
//	}
	@Then("user goes to previous page")
	public void user_goes_to_previous_page() {
		driver = driverFactory.getDriver();
		commonPage=new CommonPage(driver);
		//this.commonPage.driver.navigate().back();
	}
	
}
