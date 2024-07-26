package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.GraphPage;
import pages.LinkedListPage;
import pages.StackPage;

public class Stack_stepDef {
	StackPage StackPF;
	CommonPage CommonPF;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	public Stack_stepDef() 
	{
		this.StackPF = new StackPage(driver);
		this.CommonPF = new CommonPage(driver);
	}
	
	@Then("user should be navigated to Stack page")
	public void user_should_be_navigated_to_Graphpage() {
		driver =driverFactory.getDriver();
		StackPF = new StackPage(driver);
		StackPF.stackOption();
	}

	@When("user selects Stack item from the drop down menu")
	public void user_selects_stack_item_from_the_drop_down_menu() {
	
			driver = driverFactory.getDriver();
			CommonPF=new CommonPage(driver);
		 CommonPF.Handledropbox(); 
		}


	@When("user clicks the GetStarted button in Stack Panel")
	public void user_clicks_the_get_started_button_in_stack_panel() {
		 driver =driverFactory.getDriver();
		 StackPF = new StackPage(driver);
		 StackPF.getStarted();
	}

	@Then("user clicks OperationsInStack link")
	public void user_clicks_operations_in_stack_link() {
		StackPF.operationsInStack();
	}


	@Then("user clicks Implementation link")
	public void user_clicks_implementation_link() {
		StackPF.implementation();
	}

	@Then("user clicks Applications link")
	public void user_clicks_applications_link() {
		StackPF.applications();
	}
}
