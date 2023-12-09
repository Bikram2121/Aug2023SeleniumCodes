package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");

		waitForFrameAndSwitchToItByIdOrName(10, "main");

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

	public static WebDriver waitForFrameAndSwitchToItByIdOrName(int timeOout, String IdOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IdOrName));
	}

	public static WebDriver waitForFrameAndSwitchToItByIndex(int timeOout, int frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static WebDriver waitForFrameAndSwitchToItByFrameElement(int timeOout, WebElement frameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	public static WebDriver waitForFrameAndSwitchToItByFrameLocator(int timeOout, By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

}
