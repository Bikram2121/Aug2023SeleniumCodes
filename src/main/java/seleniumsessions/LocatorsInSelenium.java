package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		// create a webelement + perform action(click,sendkeys,gettext,isDisplayed...)
		// create a web element : need a locator

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1. id - unique attribute
		// 2. name - can be duplicate
//		driver.findElement(By.name("email")).sendKeys("asdaxc");

//		By name =  By.name("email");

		// 3. class name: can be duplicate most of te time - not recommended if its
		// duplicate
		// use class name only if its unique
//		driver.findElement(By.className("form-control")).sendKeys("sdaxczs");

//		By className = By.className("form-control");

		// 4. xpath: its not an attribute, its an address of the element in the HTML
		// DOM.

		// driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sdadsa");

//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//				
//		doSendKeys(emailId, "dasdacxz");
//		doSendKeys(password, "sadaxzcz");
//		doClick(loginButton);

		// 5. css selector: not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("asdhzx");
//		
//		By emailID = By.cssSelector("#input-email");
//		By password = By.cssSelector("#input-password");
//		By loginBtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		
//		doSendKeys(emailID, "sdadsad");
//		doSendKeys(password, "dacvsfs");
//		doClick(loginBtn);

		// 6. linkText: only for links -> htmltag = a
		// driver.findElement(By.linkText("Register")).click();

//		By registerLink = By.linkText("Register");
//		doClick(registerLink);

		// 7. partial linkText: only for links
		// Forgotten Password
		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8. tagName: html tag
//		String text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
		
		
		//getText:
		By CusName = By.tagName("h2");
		String txt = doElementGetText(CusName);
		System.out.println(txt);
		
		By logintext = By.linkText("Login");
		String txt1 = doElementGetText(logintext);
		System.out.println(txt1);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String values) {
		getElement(locator).sendKeys(values);
	}

	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
}
