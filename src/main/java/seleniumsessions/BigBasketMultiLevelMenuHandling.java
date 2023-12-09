package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		By L1Cat = By.xpath("//span[text()='Fashion'] ");
		
		selectProductLevel3Handling(L1Cat,"Men's Bottom Wear", "Men's Trousers");
		
		
	}

	public static void selectProductLevel3Handling(By l1, String l2, String l3) throws InterruptedException {
		WebElement shopParentElement = driver.findElement(l1);

		Actions act = new Actions(driver);
		act.moveToElement(shopParentElement).build().perform();
		Thread.sleep(2000);

		WebElement L2Ele = driver.findElement(By.linkText(l2));

		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);

		WebElement L3Ele = driver.findElement(By.linkText(l3));
		L3Ele.click();
	}
}
