package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	public Properties configProp;
	
	
	@Before
	public void setUp() throws IOException
	{
		
		configProp = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\manal_\\git\\DSAlgoPortal\\DSAlgoPortal\\src\\test\\resources\\config\\config.properties");
		configProp.load(fis);
		
		String browserName = configProp.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("NumpyNinja",homePageTitle);
	}
	
	
	@After
	public void tearDown() {
		
		//driver.quit();
	}

}
