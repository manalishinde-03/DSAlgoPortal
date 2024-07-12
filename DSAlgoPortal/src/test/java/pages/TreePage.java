package pages;

	import java.time.Duration;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class TreePage {
		

	   public WebDriver driver;
	   @FindBy(xpath="//a[text()='Tree']") WebElement Treeoptions;
	   @FindBy(xpath="/html/body/div[3]/div[6]/div/div/a")WebElement GetStarted;
	   @FindBy(xpath="//a[text()='Overview of Trees']")WebElement OverviewofTrees;
	   @FindBy(xpath="//a[text()='Terminologies']") WebElement Terminologies ;
	   @FindBy(xpath="//a[text()='Types of Trees']") WebElement TypesofTrees ;
	   @FindBy(xpath="//a[text()='Tree Traversals']") WebElement TreeTraversals ;
	   @FindBy(xpath="//a[text()='Traversals-Illustration']") WebElement TraversalsIllustration ;
	   @FindBy(xpath="//a[text()='Binary Trees']") WebElement BinaryTrees ;
	   @FindBy(xpath="//a[text()='Types of Binary Trees']") WebElement TypesofBinaryTrees ;
	   @FindBy(xpath="//a[text()='Implementation in Python']") WebElement ImplementationinPython ;
	   @FindBy(xpath="//a[text()='Binary Tree Traversals']") WebElement BinaryTreeTraversals ;
	   @FindBy(xpath="//a[text()='Implementation of Binary Trees']") WebElement ImplementationofBinaryTrees ;
	   @FindBy(xpath="//a[text()='Applications of Binary trees']") WebElement ApplicationsofBinaryTrees ;
	   @FindBy(xpath="//a[text()='Binary Search Trees']") WebElement BinarySearchTrees ;
	   @FindBy(xpath="//a[text()='Implementation Of BST']") WebElement ImplementationOfBST ;  
	   @FindBy(xpath="//button[text()='Run']") WebElement run;
	   @FindBy(xpath="//a[text()='Sign out']") WebElement Signout;
	   
	   
	// Constructor
	   public TreePage(WebDriver driver) {
	       this.driver = driver;
	       PageFactory.initElements(driver,this);
	   }
	//methods
	// Methods
//	   public void handledropbox(WebDriver driver) {
//			driver.findElement(By.xpath("//a[text()='Data Structures']")).click();
//		} 
//	   
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
//		
		 public void TreeOptions() {
		    	//handledropbox(driver);
				//driver.findElement(By.xpath("//a[text()='Tree']")).click();
			 Treeoptions.click();
		 }
		 public void GetStarted() {
			 GetStarted.click();
		 }
		 public void OverviewofTrees() {
				OverviewofTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void Terminologies() {
				Terminologies.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void TypesofTrees() {
				TypesofTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void TreeTraversals() {
				TreeTraversals.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void TraversalsIllustration() {
				TraversalsIllustration.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void BinaryTrees() {
				BinaryTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void TypesofBinaryTrees() {
				TypesofBinaryTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void ImplementationinPython() {
				ImplementationinPython.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void BinaryTreeTraversals() {
				BinaryTreeTraversals.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		 }
		 public void ImplementationofBinaryTrees() {
				ImplementationofBinaryTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//	            click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
	     }
	       public void ApplicationsofBinaryTrees() {
				ApplicationsofBinaryTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
	      }
	            public void BinarySearchTrees() {
				BinarySearchTrees.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
	            }
	            public void ImplementationOfBST() {
				ImplementationOfBST.click();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "print('Hello World')");
//				driver.navigate().back();
//				click_tryhere_with_timeout(driver, 10);
//				try_python_script(driver, "Hello World"); // negative test.. it should fail
//				driver.navigate().back();
		        
		    }
//				public void signout() {
//					Signout.click();	
//				}
//	}


}
