package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.aventstack.extentreports.gherkin.model.Scenario;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {
	
//	public static WebDriver driver;
//	public ConfigReader configReader;
//	public Properties configProp;
//	
//	
//	@Before
//	public void setUp() throws IOException
//	{
//		configReader = new ConfigReader();
//		configProp = configReader.initializeProp();
//		String browserName = configProp.getProperty("browser");
//		
//		
//		if(browserName.equals("chrome")) {
//			driver = new ChromeDriver();
//		}
//		
//		if(browserName.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		
//		if(browserName.equals("edge")) {
//			driver = new EdgeDriver();
//		}
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		
//		driver.get(configProp.getProperty("url"));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
//		String homePageTitle = driver.getTitle();
//		Assert.assertEquals("NumpyNinja",homePageTitle);
//	}
//	
//	
//	@After
//	public void tearDown() {
//		
//		driver.quit();
//	}
//
//}
	WebDriver driver;
	public Properties configProp;
	private DriverFactory driverFactory = new DriverFactory();

	@Before
	public void setUp() throws IOException {

		configProp = ConfigReader.initializeProp();
		driver = driverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(configProp.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	}

//	@After(order = 1)
//	public void takeScraenshotOnFailure(Scenario scenario) {
//try {
//		if (scenario.isFailed()) {
//
//			TakesScreenshot ts = (TakesScreenshot) driver;
//
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(src, "image/png", "screenshot");
//		}
//
//	}catch (Exception e ) {
//		e.printStackTrace();
//	}

//	}
	@After(order = 0)
	public void tearDown() {
		if (driver != null) {
			driverFactory.removeDriver();
			driver.quit();
		}
//		System.out.println("Closing browser for -" + Thread.currentThread().threadId());

	}

}
