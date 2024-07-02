package stepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;

public class Common_stepDef {

	HomePage homePage;
	LoginPage loginPage;
    CommonPage commonPage=new CommonPage(Hooks.driver);
	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() throws IOException {

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

	@And("user clicks tryhere button")
	public void graph_user_clicks_tryhere_button() {
		commonPage.click_tryhere_with_timeout(Hooks.driver, 20);
	}
	@Then("user should be directed to tryEditor write non python code and clicks run button")
	public void graph_user_should_be_directed_to_try_editor_write_non_python_code_and_clicks_run_button() {
		commonPage.try_python_script(Hooks.driver, "Hello World");
		commonPage.driver.navigate().back();// negative test.. it should fail
	}

	@And("user write python code and clicks run button and it will display output")
	public void graph_user_write_python_code_and_clicks_run_button_and_it_will_display_output() {
		commonPage.click_tryhere_with_timeout(Hooks.driver, 10);
		commonPage.try_python_script(Hooks.driver, "print('Hello World')");
	}

	@Then("user goes to previous page")
	public void graph_user_goes_to_previous_page() {
		commonPage.driver.navigate().back();
	}
	
}
