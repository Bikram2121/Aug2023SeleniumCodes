package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// create a webelement + perform action(click,sendkeys,gettext,isDisplayed...)
		// create a web element : need a locator

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.id
		// 1st
//		driver.findElement(By.id("input-email")).sendKeys("asd23");
//		driver.findElement(By.id("input-password")).sendKeys("saxzxc2");

		// 2nd:
//		WebElement emailId =  driver.findElement(By.id("input-email"));
//		WebElement password =  driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("vikkuzgmail.com");
//		password.sendKeys("37e6asdg");

		// 3rd:By locator
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//
//		eId.sendKeys("sdads@gmail.com");
//		pwd.sendKeys("ckjsdhfsd");

		// 4th:By locator + generic method
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(emailId).sendKeys("dasdsdfdffx@gmail.com");
//		getElement(password).sendKeys("asdsddsad");

		// 5th : By locator + generic methods and actions
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(emailId, "sadas@gmail.com");
//		doSendKeys(password, "sadaddx");

		// 6th:By locator + generic methods and actions in a ELementUtil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(emailId, "asdasd");
		eleutil.doSendKeys(password, "djdhakd");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String values) {
		getElement(locator).sendKeys(values);
	}

}
