package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArrayPage;
import pages.CommonPage;
import pages.TreePage;

public class Array_stepDef {
	ArrayPage ArrayPF;
	CommonPage CommonPF;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	public Array_stepDef() 
	{
		this.ArrayPF = new ArrayPage(driver);
		this.CommonPF = new CommonPage(driver);
	}
//	@Given("user navigates to Home page")
//	public void user_navigates_to_home_page() {
//		 driver = driverFactory.getDriver();
	//		CommonPF=new CommonPage(driver);
	//	 CommonPF.Handledropbox(); 
//	}

//	@Given("user navigates to Login page")
//	public void user_navigates_to_login_page() {
//		 driver =driverFactory.getDriver();
//		 ArrayPF=new ArrayPage(driver);
//		 ArrayPF.TreeOptions(); 
//	}

//	@When("user enters sheet {string} and {int}")
//	public void user_enters_sheet_and(String string, Integer int1) {
	    
//	}

//	@When("user clicks on Login button")
//	public void user_clicks_on_login_button() {
	   
//	}

	@When("user selects Array item from the drop down menu")
	public void user_selects_array_item_from_the_drop_down_menu() {
		driver = driverFactory.getDriver();
		CommonPF=new CommonPage(driver);
	 CommonPF.Handledropbox(); 
	}

	@Then("user should be navigated to Array page")
	public void user_should_be_navigated_to_array_page() {
		 driver =driverFactory.getDriver();
			ArrayPF=new ArrayPage(driver);
			ArrayPF.arrayOptions();
	}

	//@Then("user goes to previous page")
	//public void user_goes_to_previous_page() {
	   
	//}

	@When("user clicks the GetStarted button in Array Panel")
	public void user_clicks_the_get_started_button_in_array_panel() {
		 driver =driverFactory.getDriver();
		 ArrayPF=new ArrayPage(driver);
		 ArrayPF.getStarted();
	}

	@Then("user clicks ArraysInPython link")
	public void user_clicks_arrays_in_python_link() {
		ArrayPF.araaysInPython();
	}

	/*@Then("user clicks tryhere button")
	public void user_clicks_tryhere_button() {
	  
	}

	@Then("user executes code from  sheetname {string} and row number {int}")
	public void user_executes_code_from_sheetname_and_row_number(String string, Integer int1) {
	   
	}*/

	@Then("user clicks ArraysUsingList link")
	public void user_clicks_arrays_using_list_link() {
		ArrayPF.arraysUsingList();
	}

	/*@Then("user clicks signout link")
	public void user_clicks_signout_link() {
	   
	}

	@Then("logged out successfully message will be displayed")
	public void logged_out_successfully_message_will_be_displayed() {
	   
	}*/

	@Then("user clicks BasicOperationsUsingList link")
	public void user_clicks_basic_operations_using_list_link() {
		ArrayPF.basicOperationsInList();
	}

	@Then("user clicks ApplicationsOfArrays link")
	public void user_clicks_applications_of_arrays_link() {
		ArrayPF.applicationsOfArrays();
		
	}

}
