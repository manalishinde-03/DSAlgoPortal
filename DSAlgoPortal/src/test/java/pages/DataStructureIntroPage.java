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
import stepDefinitions.Hooks;
import utilities.ExcelReader;


public class DataStructureIntroPage {
	
	CommonPage commonPage = new CommonPage(Hooks.driver);	
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

public void validateAlert(String pythonCode) throws AWTException {
	
	commonPage.try_python_script(driver, pythonCode);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
}

public void executeExcelPythonCode(String sheetname, int row) throws InvalidFormatException, IOException {
	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("./src/test/resources/ExcelTestData/LoginData.xlsx", sheetname);

	String code = testdata.get(row).get("python code");

	commonPage.try_python_script(driver, code);

}



}
