package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsUseCases {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://amazon.com");

		By links = By.tagName("a");

		if (getTotalElementCount(links) > 250) {
			System.out.println("pass");
		}

	}

	public static int getTotalElementCount(By locator) {
		int eleCount = getElemets(locator).size();
		System.out.println("total elements for  : " + locator + "--->" + eleCount);
		return eleCount;
	}

	public static List<WebElement> getElemets(By locator) {
		return driver.findElements(locator);
	}

}
