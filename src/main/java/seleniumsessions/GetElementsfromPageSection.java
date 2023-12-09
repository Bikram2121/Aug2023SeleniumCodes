package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetElementsfromPageSection {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		List<WebElement> panelLinks = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//
//		System.out.println(panelLinks.size());

//		for (WebElement e : panelLinks) {
//			String panelText = e.getText();
//			System.out.println(panelText);
//		}

//		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
//		
//		List<String> rightElesList = getElementsTextList(rightPanelLinks);
//		System.out.println(rightElesList.contains("Wish List"));
		
		
		By footerLinks = By.xpath("//footer//div[@class = 'row']/div");
		List<String> footerTexts = getElementsTextList(footerLinks);
		System.out.println(footerTexts);
		
//		By attrList = By.tagName("a");
//		List<String> attrTexts = getElementAttributeList(attrList, "href");
//		System.out.println(attrTexts);
//		
//		List<String> txtList =  getElementsTextList(attrList);
//		System.out.println(txtList);
		
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
 
	public static List<String> getElementsTextList(By locator) {

		List<String> eleTextList = new ArrayList<String>(); // size = 0
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String eleText = e.getText();
			eleTextList.add(eleText);
		}
		return eleTextList;
	}

	public static List<String> getElementAttributeList(By locator , String attrName) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList =  getElements(locator);
		for (WebElement e : eleList) {
			String attrText = e.getAttribute(attrName);
			eleTextList.add(attrText);
		}
		return eleTextList;
	}
	
	
	
}
