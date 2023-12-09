package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement fn= driver.findElement(By.id("input-email"));
		fn.sendKeys("abc");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		fn.sendKeys("xyz");
		
		
		
		
	}

}
