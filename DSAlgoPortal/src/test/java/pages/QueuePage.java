package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement QueueOption;
	@FindBy(xpath = "/html/body/div[3]/div[5]/div/div/a")
	WebElement GetStarted;
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement ImplementationOfQueueInPython;
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement ImplementationUsingCollectionsdeque;
	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement ImplementationUsingArray;
	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement QueueOperations;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement Signout;

	// Constructor
	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void queueOption() {

		QueueOption.click();
	}

	public void getStarted() {
		GetStarted.click();
	}

	public void implementationOfQueueInPython() {
		ImplementationOfQueueInPython.click();
				
	}

	public void implementationUsingCollectionsdeque() {
		ImplementationUsingCollectionsdeque.click();
	}

	public void implementationUsingArray() {
		ImplementationUsingArray.click();
	}

	public void queueOperations() {
		QueueOperations.click();
	}

	public void run() {
		run.click();
	}
}