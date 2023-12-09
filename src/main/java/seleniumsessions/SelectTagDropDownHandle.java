package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		// dropdown -- > html tag ---> <select>
		// use SELECT class in selenium

//		WebElement country_ele = driver.findElement(country);
//
//		Select select = new Select(country_ele);
//		 select.selectByIndex(5);
//		 select.selectByValue("Anguilla"); // value attribute
//		select.selectByVisibleText("India"); //text of the option
		By country = By.id("Form_getForm_Country");

		doSelectDropDownByindex(country, 10);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "India");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "Angola");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByindex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
