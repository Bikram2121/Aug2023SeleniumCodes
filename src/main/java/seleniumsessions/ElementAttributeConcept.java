package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		
//		String imgTitle =  driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(imgTitle);
//		
//		String imgSrc =  driver.findElement(By.className("img-responsive")).getAttribute("src");
//		System.out.println(imgSrc);

		By fname = By.name("firstname");
		By logo = By.className("img-responsive");

		String ph = getElementAttribute(fname, "placeholder");
		System.out.println(ph);
		
		String logoattr = getElementAttribute(logo, "src");
		System.out.println(logoattr);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
