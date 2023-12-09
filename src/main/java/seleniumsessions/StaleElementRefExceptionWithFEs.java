package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElementRefExceptionWithFEs {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> linksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a")); // v1

		for (int i = 0; i < linksList.size(); i++) {
			linksList.get(i).click(); // v1
			// dom v2
			linksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a")); //dom v2
		}
	}

}
