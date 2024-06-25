package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.TestBase;

public class DataStructureIntroPage extends TestBase {
	
	@FindBy(xpath ="//a[text()='Time Complexity']" )
	WebElement link_TimeComplexity;
	
	@FindBy(xpath ="//a[text()='Practice Questions']" )
	WebElement link_PracticeQuestions;
	
	@FindBy(linkText ="Try here>>>" )
	WebElement btn_tryHere;
	
	@FindBy(xpath ="//div[@class='input']/div/div/textarea")
	WebElement text_tryEditor;
	
	@FindBy(xpath ="//pre[@id='output']")
	WebElement text_output;
	
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn_Run;
	
public DataStructureIntroPage() {
		
		PageFactory.initElements(driver,this);
	}

public void clickTimeComplexityLink() {
	
	link_TimeComplexity.click();
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Time Complexity");
}

public void clickPracticeQuestionsLink() {
	link_PracticeQuestions.click();
	String pageTitle = driver.getTitle();
	Assert.assertEquals(pageTitle, "Practice Questions");
	
}

public void clickTryHereButton() {
	Actions action = new Actions(driver);
	action.scrollToElement(btn_tryHere);
	
	 btn_tryHere.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
}

public void executePythonCode(String pythonCode) {
	
	text_tryEditor.sendKeys(pythonCode);
	btn_Run.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	String output = text_output.getText();
	System.out.println("Python code executed!! Output : "+output);
	
}

public void validateAlert(String pythonCode) {
	
	executePythonCode(pythonCode);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Alert alert = driver.switchTo().alert();
//	String alertMessage= driver.switchTo().alert().getText();
//	System.out.println("Alert Message : "+alertMessage);
	alert.accept();
	
}

}
