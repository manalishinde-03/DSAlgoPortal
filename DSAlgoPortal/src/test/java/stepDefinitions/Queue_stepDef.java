package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.LinkedListPage;
import pages.QueuePage;
import pages.StackPage;

public class Queue_stepDef {
	QueuePage QueuePF;
	CommonPage CommonPF;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	public Queue_stepDef() 
	{
		this.QueuePF = new QueuePage(driver);
		this.CommonPF = new CommonPage(driver);
	}

	@When("user selects Queue item from the drop down menu")
	public void user_selects_queue_item_from_the_drop_down_menu() {
		driver = driverFactory.getDriver();
		CommonPF=new CommonPage(driver);
	 CommonPF.Handledropbox(); 
	}

	@Then("user should be navigated to Queue page")
	public void user_should_be_navigated_to_Queuepage() {
		driver =driverFactory.getDriver();
		QueuePF = new QueuePage(driver);
		QueuePF.queueOption();
	}

	@When("user clicks the GetStarted button in Queue Panel")
	public void user_clicks_the_get_started_button_in_queue_panel() {
			 driver =driverFactory.getDriver();
			 QueuePF = new QueuePage(driver);
			 QueuePF.getStarted();
	}

	@Then("user clicks ImplementationOfQueueInPython link")
	public void user_clicks_implementation_of_queue_in_python_link() {
		QueuePF.implementationOfQueueInPython();
	}

	@Then("user clicks ImplementationUsingCollectionQueue link")
	public void user_clicks_implementation_using_collection_queue_link() {
		QueuePF.implementationUsingCollectionsdeque();
	}

	@Then("user clicks ImplementationUsingArray link")
	public void user_clicks_implementation_using_array_link() {
		QueuePF.implementationUsingArray();
	}

	@Then("user clicks QueueOperations link")
	public void user_clicks_queue_operations_link() {
		QueuePF.queueOperations();
	}
}
