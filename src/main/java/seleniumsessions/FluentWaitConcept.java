package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		By price = By.linkText("Pricing");

		waitForElementPresenceWithFluentWait(10, 2, price).click();

	}

	public static WebElement waitForElementPresenceWithFluentWait(int timeOut, int pollingTime, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime)).withMessage("element is not found on the page...");

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void waitForAlertPresenceWithFluentWait(int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoAlertPresentException.class).pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("alert is not found on the page...");
		wait.until(ExpectedConditions.alertIsPresent());

	}

}
