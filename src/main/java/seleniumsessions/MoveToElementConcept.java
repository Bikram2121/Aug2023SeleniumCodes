package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://mrbool.com/search/");
		
		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));	
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
		
	}

}
