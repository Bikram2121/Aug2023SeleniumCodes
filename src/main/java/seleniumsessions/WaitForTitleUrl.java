package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.linkText("Forgotten Password")).click();

		// System.out.println(driver.getTitle());//loading... checking...

//		String title = waitForTitleContainsAndFetch(10, "Password?");
//
//		if (title.contains("Forgot Your Password?")) {
//			System.out.println("pass");
//		}
		
		String title = waitForTitleIsAndFetch(10, "Forgot Your Password?");
		if (title.equals("Forgot Your Password?")) {
			System.out.println("pass");
		}
		
		if (waitForUrlContains(10, "forgotten")) {
			System.out.println("correct url");
		}
		
		
	}

	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}
	
	public static String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	} 
	
	public static String waitForUrlContainsAndFetch(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();
	}
	
	public static Boolean waitForUrlContains(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));	
	}
	
	public static String waitForUrlIsAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}
	

}
