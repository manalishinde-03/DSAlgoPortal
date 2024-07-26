package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	  public WebDriver driver;
	   @FindBy(xpath="//a[text()='Linked List']") WebElement LinkedListOption;
	   @FindBy(xpath="/html/body/div[3]/div[3]/div/div/a")WebElement GetStarted;
	   @FindBy(xpath="//a[text()='Introduction']")WebElement Introduction;
	   @FindBy(xpath="//a[text()='Creating Linked LIst']") WebElement CreatingLinkedList ;
	   @FindBy(xpath="//a[text()='Types of Linked List']") WebElement TypesOfLinkedList ;
	   @FindBy(xpath="//a[text()='Implement Linked List in Python']") WebElement ImplimentLinkedListInPython ;
	   @FindBy(xpath="//a[text()='Traversal']") WebElement Traversal ;
	   @FindBy(xpath="//a[text()='Insertion']") WebElement Insertion ;
	   @FindBy(xpath="//a[text()='Deletion']") WebElement Deletion ;
	   @FindBy(xpath="//*[text()='Try here>>>']") WebElement TryHereButton ;
	   @FindBy(xpath="//button[text()='Run']") WebElement run;
	   @FindBy(xpath="//a[text()='Sign out']") WebElement Signout;
	   
	   
	// Constructor
	   public LinkedListPage(WebDriver driver) {
	       this.driver = driver;
	       PageFactory.initElements(driver,this);
	   }


		//		
		 public void linkedListOption() {
		    	
			 LinkedListOption.click();
		 }
		 public void getStarted() {
			 GetStarted.click();
		 }
		 public void introduction() {
			 Introduction.click();
//				
		 }
		 public void creatingLinkedList() {
			 CreatingLinkedList.click();
				
		 }
		 public void typesOfLinkedList() {
			 TypesOfLinkedList.click();
				
		 }
		 public void implimentLinkedListInPython() {
			 ImplimentLinkedListInPython.click();
			
		 }
		 public void traversal() {
			 Traversal.click();
				
		 }
		 public void insertion() {
			 Insertion.click();
				
		 }
		 public void deletion() {
			 Deletion.click();
			
		 }
		 public void tryHereButton() {
			 TryHereButton.click();

		 }
		 public void run() {
			 run.click();
		 }
}
