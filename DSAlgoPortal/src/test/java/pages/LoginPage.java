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

public class LoginPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement txt_username_login;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txt_password_login;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btn_login;

	@FindBy(xpath = "//div[2]/div/div[2]/a")
	WebElement link_register;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement text_errorMsg;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterDataForLogin(String username, String password) {

		txt_username_login.sendKeys(username);
		txt_password_login.sendKeys(password);

	}

	public void clickLoginBtn() {
		btn_login.click();
		
	}

	public void clickRegisterLink() {
		link_register.click();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/register", url);
		System.out.println("User navigated to Register page!");
	}

	public void validateErrorMsg(String errorMessage) {
		String actualMsg = text_errorMsg.getText();

		Assert.assertEquals(actualMsg, errorMessage);
		System.out.println("Error Displayed!");
	}

	public void validateToolTipErrorMsg(String errorMessage) {

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
	}

	// to verify tooltip message
	public boolean isAttribtuePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}
		return result;
	}

	public void enterExcelDataForLogin(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);

		String username = testdata.get(rownumber).get("username");
		String password = testdata.get(rownumber).get("password");

		// String message = testdata.get(rownumber).get("expectedmessage");

		enterDataForLogin(username, password);

	}

	public void validateToolTipErrorMessageExcel(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {


		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);

		String errorMessage = testdata.get(rownumber).get("message");
		validateToolTipErrorMsg(errorMessage);
	}


public void validateErrorMessageExcel(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {

	ExcelReader reader = new ExcelReader();
	List<Map<String, String>> testdata = reader.getData("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\ExcelTestData\\LoginData.xlsx", sheetname);

	String errorMessage = testdata.get(rownumber).get("message");
	validateErrorMsg(errorMessage);
}

}
