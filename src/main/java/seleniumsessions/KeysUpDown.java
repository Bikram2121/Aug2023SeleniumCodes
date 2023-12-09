package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.com");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		
		
		
	}

}
