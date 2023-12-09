package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		Boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//
//		if (flagImg)
//			System.out.println("pass");
//
//		boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//		if (flagSearch) {
//			System.out.println("pass");
//			driver.findElement(By.name("search")).sendKeys("macbook");
//		}

		By logoImg = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.cssSelector("#search > span > button");

		if (doElementIsDisplayed(logoImg)) {
			System.out.println("image is present----pass");
		}

		if (doElementIsDisplayed(search)) {
			System.out.println("search is present---pass");
			doSendKeys(search, "Macbook");
			doClick(searchIcon);

		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static void doSendKeys(By locator, String values) {
		getElement(locator).sendKeys(values);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
