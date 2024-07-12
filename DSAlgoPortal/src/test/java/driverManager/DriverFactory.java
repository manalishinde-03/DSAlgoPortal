package driverManager;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import utilities.ConfigReader;

public class DriverFactory {
public static Properties configProp;
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>() {
		protected WebDriver initialValue() {
			configProp = ConfigReader.initializeProp();
            String browser = configProp.getProperty("browser"); // Default to Chrome if no property is set
            System.out.println("Browser Value :>>>"+browser);
            if (browser == null) {
                browser = "chrome";
            }
            switch (browser.toLowerCase()) {
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    return new FirefoxDriver(firefoxOptions);
                    
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    return new EdgeDriver(edgeOptions);
                case "chrome":
                default:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    return new ChromeDriver(chromeOptions);
            }
            
		}
	};

	public WebDriver getDriver() {
		return tlDriver.get();
	}

	public void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public void removeDriver() {
		tlDriver.remove();
	}
	
	

	
	

	/*
	 * public static void initBrowser(String browserName) { if
	 * (browserName.equals("chrome")) { // driver = new ChromeDriver();
	 * 
	 * tlDriver.set(new ChromeDriver());
	 * System.out.println("Starting browser for -"+Thread.currentThread().threadId()
	 * ); }
	 * 
	 * if (browserName.equals("firefox")) { // driver = new FirefoxDriver();
	 * tlDriver.set(new FirefoxDriver()); }
	 * 
	 * if (browserName.equals("edge")) { // driver = new EdgeDriver();
	 * tlDriver.set(new EdgeDriver()); } }
	 * 
	 * public static WebDriver getDriver() { return tlDriver.get(); // return
	 * driver; }
	 */

}
