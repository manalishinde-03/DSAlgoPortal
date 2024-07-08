package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver driver;
	
	public static void initBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
	}
	
	public static WebDriver getDriver() {
		System.out.println(">>>>>>>>>>>>>");
		return driver;
	}
}
