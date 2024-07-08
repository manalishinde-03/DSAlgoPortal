package stepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

	public static WebDriver driver;
	public Properties configProp;
	DriverFactory driverFactory;

	@Before
	public void setUp() throws IOException {

		System.out.println("I'm in hooks.....");

		configProp = ConfigReader.initializeProp();
		DriverFactory.initBrowser(configProp.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(configProp.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	}

	@After
	public void tearDown() {
		System.out.println(">>>>>>in after method");
		driver.quit();
	}

}
