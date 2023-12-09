package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinksAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://amazon.com");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		List<WebElement> linksList = getElemets(links);
//		System.out.println("totale links : " +linksList.size());
//		
//		for (WebElement e : linksList) {
//			String linkText = e.getText();
//			String hrefVal = e.getAttribute("href");
//			System.out.println(hrefVal + ": :" + linkText);
//		}

		
		getElementAttributes(links, "href");
		getElementAttributes(images, "src");
		
		
	}

	
	public static void getElementAttributes(By locator , String AttrName) {
		List<WebElement> eleList =  getElemets(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(AttrName);
			System.out.println(attrVal);
		}
	}
	
	
	public static List<WebElement> getElemets(By locator) {
		return driver.findElements(locator);
	}

}
