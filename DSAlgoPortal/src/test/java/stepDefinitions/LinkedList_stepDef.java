package stepDefinitions;

import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.GraphPage;
import pages.LinkedListPage;

public class LinkedList_stepDef {
	LinkedListPage LinkedListPF;
	CommonPage CommonPF;
	private DriverFactory driverFactory = new DriverFactory();
	private WebDriver driver;
	
	public LinkedList_stepDef() 
	{
		this.LinkedListPF = new LinkedListPage(driver);
		this.CommonPF = new CommonPage(driver);
	}
	
	@Then("user should be navigated to LinkedList page")
	public void user_should_be_navigated_to_LinkedListpage() {
		driver =driverFactory.getDriver();
		LinkedListPF = new LinkedListPage(driver);
		LinkedListPF.linkedListOption();
	}

	@When("user selects LinkedList item from the drop down menu")
	public void user_selects_linked_list_item_from_the_drop_down_menu() {
		driver = driverFactory.getDriver();
		CommonPF=new CommonPage(driver);
	 CommonPF.Handledropbox(); 
	}

	@When("user clicks the GetStarted button in LinkedList Panel")
	public void user_clicks_the_get_started_button_in_linked_list_panel() {
		 driver =driverFactory.getDriver();
		 LinkedListPF = new LinkedListPage(driver);
		 LinkedListPF.getStarted();
	}

	@Then("user clicks Intruduction link")
	public void user_clicks_intruduction_link() {
		LinkedListPF.introduction();
	}

	@Then("user clicks CreatingLinkedList link")
	public void user_clicks_creating_linked_list_link() {
		LinkedListPF.creatingLinkedList();
	}

	@Then("user clicks TypesOfLinkedList link")
	public void user_clicks_types_of_linked_list_link() {
		LinkedListPF.typesOfLinkedList();
	}

	@Then("user clicks ImplimentLinkedListInPython link")
	public void user_clicks_impliment_linked_list_in_python_link() {
		LinkedListPF.implimentLinkedListInPython();
	}

	@Then("user clicks Traversal link")
	public void user_clicks_traversal_link() {
		LinkedListPF.traversal();
	}

	@Then("user clicks Insertion link")
	public void user_clicks_insertion_link() {
		LinkedListPF.insertion();
	}

	@Then("user clicks Deletion link")
	public void user_clicks_deletion_link() {
		LinkedListPF.deletion();
	}
}
