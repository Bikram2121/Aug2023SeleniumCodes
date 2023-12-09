package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPageTest {

	public static void main(String[] args) {

		String browserName = "edge";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println(title);

//		 By locators: Object Repository
//		By firstName = By.id("input-firstname");
//		By lastName = By.name("lastname");
//		By eMail = By.xpath("//*[@id=\"input-email\"]");
//		By telephone = By.cssSelector("#input-telephone");
//		By password = By.id("input-password");
//		By confirmPwd = By.id("input-confirm");
//		By radioBtn = By.cssSelector(
//				"#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]");
//		By privacyCheckBox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continueBtn = By.className("btn-primary");
//		By accountCreatedText = By.tagName("h1");
//
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(firstName, "harolusd");
//		eleUtil.doSendKeys(lastName, "kumaascr");
//		eleUtil.doSendKeys(eMail, "haroldkumar14@gmail.com");
//		eleUtil.doSendKeys(telephone, "99859717895");
//		eleUtil.doSendKeys(password, "harold111");
//		eleUtil.doSendKeys(confirmPwd, "harold111");
//		// eleUtil.doSendKeys(firstName, "vikram");
//
//		eleUtil.doClick(radioBtn);
//		eleUtil.doClick(privacyCheckBox);
//		eleUtil.doClick(continueBtn);
//
//		String accountTxt = eleUtil.doElementGetText(accountCreatedText);
//		System.out.println(accountTxt);
//
//		eleUtil.doClick(accountCreatedText);
//
//		eleUtil.doClick(continueBtn);

		// to count all search fields in a web page:
		//List<WebElement> searchList = driver.findElements(By.className("form-control")); 
		//List<WebElement> searchList = driver.findElements(By.xpath("//input[@placeholder]")); // xpath 
		List<WebElement> searchList = driver.findElements(By.xpath("//form//input[@placeholder]")); // another xpath
		
//		int searchSize = searchList.size();
//		System.out.println(searchSize);
		int count = 0;

		for (WebElement e : searchList) {
			String text = e.getAttribute("placeholder");
			System.out.println(text);
			count++;
		}
		
		System.out.println("total count is : " + count);
		//System.out.println("total count is : " + (count-1));

	}

}
