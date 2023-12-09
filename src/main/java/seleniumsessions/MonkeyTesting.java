package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MonkeyTesting {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");

		List<WebElement> footerList = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		int footerCount = footerList.size();
		System.out.println("total footer links : " + footerCount);

		for (int i = 0; i < footerCount; i++) {
			int randomIndex = (int) Math.floor(Math.random() * footerCount);
			System.out.println(randomIndex);

			WebElement e = footerList.get(randomIndex);
			System.out.println(e.getText());
			e.click();
			driver.navigate().back();
			Thread.sleep(1500);
			footerList = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		}

		
//		List<WebElement> headerList = driver.findElements(By.cssSelector("div#nav-xshop a:not(.nav-hidden-aria)"));
//		int headerCount = headerList.size();
//		System.out.println(headerCount);
//		
//		for (int i = 0; i < headerCount; i++) {
//			int randomIndex = (int) Math.floor(Math.random()*headerCount);
//			System.out.println(randomIndex);
//			WebElement e = headerList.get(randomIndex);
//			System.out.println(e.getText());
//			e.click();
//			
//			driver.navigate().back();
//			Thread.sleep(1500);
//			headerList = driver.findElements(By.cssSelector("div#nav-xshop a:not(.nav-hidden-aria)"));
//		}
		
		
		
	}

}
