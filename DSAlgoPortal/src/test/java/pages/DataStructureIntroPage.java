package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import utilities.ExcelReader;


public class DataStructureIntroPage {
	
	WebDriver driver;
	
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
	
public DataStructureIntroPage(WebDriver driver) {
	this.driver = driver;
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
//use try here from common page 
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

public void validateAlert(String pythonCode) throws AWTException {
	
	executePythonCode(pythonCode);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
	 * driver.switchTo().alert();
	 * System.out.println(driver.switchTo().alert().getText()); alert.accept();
	 */
	
	Robot r = new Robot();
	 
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	
	//Alert alert = driver.switchTo().alert();
	//String alertMessage= driver.switchTo().alert().getText();
	//System.out.println("Alert Message : "+alertMessage);
	//alert.accept();
	
}

public void executeExcelPythonCode(String sheetname, int row) throws InvalidFormatException, IOException {
	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);

	String code = testdata.get(row).get("python code");

	executePythonCode(code);

}



}
