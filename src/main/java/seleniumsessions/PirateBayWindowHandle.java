package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PirateBayWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://thebay.cf/index.php");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@placeholder='Pirate Search']")).sendKeys("flash");

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		if (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowId);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
