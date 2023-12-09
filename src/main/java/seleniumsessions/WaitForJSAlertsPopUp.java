package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertsPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		waitForAlertPresence(10);
		String text = getAlertText(10);
		System.out.println(text);
		getAlertText(5);
		acceptAlert(5);

	}

	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String getAlertText(int timeOut) {
		return waitForAlertPresence(timeOut).getText();
	}

	public static void acceptAlert(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}

	public static void acceptSendKeys(int timeOut, String value) {
		waitForAlertPresence(timeOut).sendKeys(value);
	}

}
