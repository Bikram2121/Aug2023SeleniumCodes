package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserMultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();

		Thread.sleep(3000);

		WebElement twtEle = driver.findElement(By.xpath("//a[contains(@href , 'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href , 'facebook')]"));
		WebElement lnkdinEle = driver.findElement(By.xpath("//a[contains(@href , 'linkedin')]"));
		WebElement ytubeEle = driver.findElement(By.xpath("//a[contains(@href , 'youtube')]"));

		twtEle.click();
		fbEle.click();
		lnkdinEle.click();
		ytubeEle.click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);

			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
