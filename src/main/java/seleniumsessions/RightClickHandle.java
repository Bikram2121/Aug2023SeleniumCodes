package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		// WebElement rightEle =
		// driver.findElement(By.xpath("//ul[@class='context-menu-list
		// context-menu-root']/li[3]/span"));
		List<WebElement> rightEle = driver.findElements(By.cssSelector("ul.context-menu-list span"));

		System.out.println(rightEle.size());

		for (WebElement e : rightEle) {
			String contextOptions = e.getText();
			System.out.println(contextOptions);

			if (contextOptions.equals("Copy")) {
				e.click();
				break;
			}
			
		}
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

	}

}
