package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.TreePage;


public class Tree_stepDef {
	
	TreePage TreePF;
	CommonPage CommonPF;
	public Tree_stepDef() 
	{
		this.TreePF = new TreePage(Hooks.driver);
		this.CommonPF = new CommonPage(Hooks.driver);
	}
 @When("user selects Tree from the drop down menu")
 public void user_selects_Tree_from_the_drop_down_menu()
 {
	 CommonPF.Handledropbox(); 
 }
 @Then("user navigated to Tree Page")
 public void user_should_be_navigated_to_Tree_Page() {
	 TreePF.TreeOptions();
 }

 @When("user clicks the GetStarted button in Tree Panel")
 public void user_clicks_the_GetStarted_button_in_Tree_Panel()
 {
	 TreePF.GetStarted();
 }
 @And("user clicks OverviewofTrees link")
	public void user_clicks_overview_of_trees() {
		TreePF.OverviewofTrees();	
 }
 @Then("user clicks Terminologies link")
 public void user_clicks_Terminologies() {
		TreePF.Terminologies(); 
 }
 @When("user clicks TypesofTrees link")
	public void user_clicks_TypesofTrees() {
    TreePF.TypesofTrees();			
}
	@When("user clicks TreeTraversals link")
	public void user_clicks_Tree_Traversals() {
		TreePF.TreeTraversals();
	}
	@When("user clicks Traversals-Illustration link")
	public void user_clicks_Traversals_Illustration() {
		TreePF.TraversalsIllustration();		
}
@When("user clicks BinaryTrees link")
	public void user_clicks_BinaryTrees() {
	 	TreePF.BinaryTrees();
}
@When("user clicks TypesofBinaryTrees link")
	public void user_clicks_Types_of_Binary_Trees() {
	 	TreePF.TypesofBinaryTrees();
}
@When("user clicks ImplementationinPython link")
	public void user_clicks_Implementation_in_Python() {
	 	TreePF.ImplementationinPython();
}
@When("user clicks BinaryTreeTraversals link")
	public void user_clicks_Binary_Tree_Traversals() {
     TreePF.BinaryTreeTraversals();
}
@When("user clicks ImplementationofBinaryTrees link")
 public void user_clicks_Implementation_of_Binary_Trees() {
      TreePF.ImplementationofBinaryTrees();
}
@When("user clicks ApplicationsofBinaryTrees link")
 public void user_clicks_Applications_of_Binary_trees() {
     TreePF.ApplicationsofBinaryTrees();   
}
@When("user clicks BinarySearchTrees link")
 public void user_clicks_Binary_Search_Trees() {
     TreePF.BinarySearchTrees();
}
@When("user clicks ImplemenationOfBST link")
public void user_clicks_Implementation_Of_BST() {
   TreePF.ImplementationOfBST();
}

}

