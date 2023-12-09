package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithClickAndReady {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		By price = By.linkText("Pricing");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(price)).click();
		
		
	}
	
	

}
