package pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import utilities.ExcelReader;


public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(xpath ="//input[@name='username']" )
	WebElement txt_username_register;
	@FindBy(xpath ="//input[@name='password1']" )
	WebElement txt_password_register;
	@FindBy(xpath ="//input[@name='password2']" )
	WebElement txt_passwordConfirm;
	@FindBy(xpath ="//input[@value='Register']" )
	WebElement btn_register;
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/a")
	WebElement link_Login;
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_errorMsg;
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_successMsg;
	@FindBy(linkText ="Register")
	WebElement link_Register;
	
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String username) {
		txt_username_register.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password_register.sendKeys(password);
	}
	
	public void enterPasswordConfirmation(String passwordConfirm) {
		txt_passwordConfirm.sendKeys(passwordConfirm);
	}
	
	public HomePage clickRegisterBtn() {
		btn_register.click();
		return new HomePage(driver);
	}

	public void validateErrorMsgRegistration(String errorMessage) {
		  String actualMsg = text_errorMsg.getText();
		  
		  Assert.assertEquals(actualMsg,errorMessage);
		  System.out.println("Error Displayed!");
	}
	
	public void validateToolTipErrorMsgRegistration(String errorMessage) {
		  
		  WebElement activeElement = driver.switchTo().activeElement();
		  String messageStr = activeElement.getAttribute("validationMessage");
		  System.out.println("Actual message appeared on screen: " + messageStr);
	}
	public LoginPage clickLoginLink() {
		
		link_Login.click();
		return new LoginPage(driver);
	
	}
	public void enterExcelDataForRegistration(String sheetname, int rowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);

		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		String passwordConfirm = testdata.get(rowNumber).get("password confirmation");

		enterUsername(username);
		enterPassword(password);
		enterPasswordConfirmation(passwordConfirm);
	}

}
