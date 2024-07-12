package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetryElementLocator {
	
	private WebDriver driver;
    private Duration timeoutInSeconds;

    public RetryElementLocator(WebDriver driver, Duration timeoutInSeconds) {
        this.driver = driver;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public WebElement findElement(final By locator) {
        return new WebDriverWait(driver, timeoutInSeconds).until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                try {
                    return driver.findElement(locator);
                } catch (StaleElementReferenceException e) {
                    return null;
                }
            }
        });
    }

}
