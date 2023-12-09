package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://www.freshworks.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By footer = By.cssSelector("footer a");
		
		//List<WebElement> footerList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
		List<WebElement> footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));
		
		
		System.out.println(footerList.size());
		
		

	}

}
