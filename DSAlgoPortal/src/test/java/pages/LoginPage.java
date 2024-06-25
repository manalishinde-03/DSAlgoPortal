package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath ="//input[@name='username']" )
	WebElement txt_username_login;
	
	@FindBy(xpath ="//input[@name='password']" )
	WebElement txt_password_login;
	
	@FindBy(xpath ="//input[@value='Login']" )
	WebElement btn_login;
	
	@FindBy(xpath ="//div[2]/div/div[2]/a" )
	WebElement link_register;
	
	@FindBy(xpath ="//div[@class='alert alert-primary']" )
	WebElement text_errorMsg;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
		if(!driver.getTitle().equals("Login"))
		{
			throw new IllegalStateException("This is Not Login page.The current page is:" +driver.getCurrentUrl());
		}
	}

	/*
	 * public void enterUsername(String username) {
	 * txt_username_login.sendKeys(username); }
	 * 
	 * public void enterPassword(String password) {
	 * txt_password_login.sendKeys(password); }
	 */
	
	
	public HomePage login(String username,String password) {
		
		txt_username_login.sendKeys(username);
		txt_password_login.sendKeys(password);
		
		return new HomePage();
	}
	
	public void clickLoginBtn() {
		btn_login.click();
	}
	
	public void clickRegisterLink() {
		link_register.click();
		String url = driver. getCurrentUrl();
		Assert.assertEquals("https://dsportalapp.herokuapp.com/register", url);
		System.out.println("User navigated to Register page!");
	}
	
	public void validateErrorMsg(String errorMessage) {
		  String actualMsg = text_errorMsg.getText();
		  
		  Assert.assertEquals(actualMsg,errorMessage);
		  System.out.println("Error Displayed!");
	}

	public void validateToolTipErrorMsg(String errorMessage) {
		  
		  WebElement activeElement = driver.switchTo().activeElement();
		  String messageStr = activeElement.getAttribute("validationMessage");
		  System.out.println("Actual message appeared on screen: " + messageStr);
	}
		   
		 //to verify tooltip message   
		   public boolean isAttribtuePresent(WebElement element, String attribute) {
			   Boolean result = false;
			   try {
			   String value = element.getAttribute(attribute);
			   if (value != null){
			   result = true;
			     }
			   } catch (Exception e) {}
			   return result;
	}

}
