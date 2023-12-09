package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysConcept {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.keyDown(element, Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		
		
		
		
	}

}
