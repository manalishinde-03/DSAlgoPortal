package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GraphPage {
	public WebDriver driver;
	  @FindBy(xpath="//a[text()='Graph']")WebElement GraphOptions;
	  @FindBy(xpath="/html/body/div[3]/div[7]/div/div/a")WebElement GetStarted;
	  @FindBy(xpath="//div/ul[2]/a[text()='Graph']")WebElement Graph;
	  @FindBy(xpath="//a[text()='Graph Representations']") WebElement GraphRepresentations ;
	  @FindBy(xpath="//input[@name='username']")WebElement user;
	  @FindBy(xpath="//input[@name='password']")WebElement pwd;
	  @FindBy(xpath="//input[@value='Login']")WebElement login;
	  @FindBy(xpath="//a[text()='Sign in']")WebElement signin;
	  	
	  //@FindBy(xpath="//button[text()='Run']") WebElement Run;
	  //@FindBy(xpath="//a[text()='Sign out']") WebElement Signout;
	   
	   
	// Constructor
	   public GraphPage(WebDriver driver) {
	       this.driver = driver;
	       PageFactory.initElements(driver,this);
	   }
	// Methods
//	   public void handledropbox(WebDriver driver) {
//			driver.findElement(By.xpath("//a[text()='Data Structures']")).click();
//		} 
	   
//	   public void click_tryhere_with_timeout(WebDriver driver, int timeout) {
//			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//			WebElement tryhere = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Try here>>>")));
//			tryhere.click();
//		}
//	   
//	   public void try_python_script(WebDriver driver, String pythontext) {
//			try {
//				WebElement editsheet = driver.findElement(By.xpath("//div[@class='input']/div/div/textarea"));
//				editsheet.sendKeys(pythontext);
//				run.click();
//				if (isAlertPresent(driver)) {
//					Alert alert = driver.switchTo().alert();
//					String alertText = alert.getText();
//					System.out.println("Alert Text: " + alertText);
//					alert.accept(); // Handle the alert
//
//				} else {
//					// If no alert is present, proceed with further actions
//					System.out.println("No alert was present.");
//				}
//			} catch (Exception e) {
//				System.out.println("Exception occurred: " + e.getMessage());
//			}
//		}
//	   
//	// Method to check if alert is present
//		private boolean isAlertPresent(WebDriver driver) {
//			try {
//				driver.switchTo().alert();
//				return true;
//			} catch (NoAlertPresentException e) {
//				return false;
//			}
//		}
	   public void enteruserpassword(String username,String password) {
		   user.sendKeys(username);
		   pwd.sendKeys(password);
	   }
	   public void login() {
		   login.click();
	   }
//		
		 public void GraphOptions() {
		    	//handledropbox(driver);
				//driver.findElement(By.xpath("//a[text()='Graph']")).click();
			 GraphOptions.click();
		 }
		 public void GetStarted() {
			// WebDriverWait getstarted = new WebDriverWait(driver,Duration.ofSeconds(10));
			 //try {
			   // WebElement GetStarted=getstarted.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[7]/div/div/a")));
			    if(GetStarted.isDisplayed()&&GetStarted.isEnabled())
			    {
			    GetStarted.click();
			    }
		 }
//			 catch (Exception e) {
//		            e.printStackTrace();
////		        } finally {
////		            driver.quit();
//		        }
//		    }
		 public void Graph(WebDriver driver, int timeout) {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//				WebElement Graph= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/ul[2]/a[text()='Graph']")));
//		        Graph.click();
               
		        try {
		        

		            // Wait until the element is visible and clickable
		           
		            WebElement Graph = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/ul[2]/a[text()='Graph']")));

		            // Now you can interact with the element
		            Graph.click(); // Example action

		        } catch (Exception e) {
		            e.printStackTrace();
//		        } finally {
//		            driver.quit();
		        }
		    }
	 
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 public void GraphRepresentations() {
			 GraphRepresentations.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
//		 public void signout() {
//			 Signout.click();
//		 }
//		

		public void signin() {
		signin.click();	
		}
	  


}
