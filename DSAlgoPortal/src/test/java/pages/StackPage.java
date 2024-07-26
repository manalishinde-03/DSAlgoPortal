package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement StackOption;
	@FindBy(xpath = "/html/body/div[3]/div[4]/div/div/a")
	WebElement GetStarted;
	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement OperationsInStack;
	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement Implementation;
	@FindBy(xpath = "//a[text()='Applications']")
	WebElement Applications;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement Signout;

	// Constructor
	public StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void stackOption() {

		StackOption.click();
	}

	public void getStarted() {
		GetStarted.click();
	}

	public void operationsInStack() {
		OperationsInStack.click();
				
	}

	public void implementation() {
		Implementation.click();

	}

	public void applications() {
		Applications.click();

	}

	public void run() {
		run.click();
	}
}
