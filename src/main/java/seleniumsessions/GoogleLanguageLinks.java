package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://google.com");
		
//		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(langLinks.size());
		
//		for (WebElement e : langLinks) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if (text.equals("বাংলা")) {
//				e.click();
//				break;
//			}
//		}
		
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		By FooLinks = By.className("pHiOh");
		
//		getLangLinksList(langLinks);
//		clickOnLangLinks(langLinks, "ಕನ್ನಡ");
		getFooterLinks(FooLinks);
		
		
		
		
	}
	
	
	public static void clickOnLangLinks(By locator, String value) {
		List<WebElement> langLinksList = driver.findElements(locator);
		for (WebElement e : langLinksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
			
		}
	}
		
		public static List<String> getLangLinksList(By locator) {
			List<WebElement> langLinksList = driver.findElements(locator);
			int langLinksCount = langLinksList.size();
			System.out.println(langLinksCount);
			List<String> LinksList = new ArrayList<String>();
			for (WebElement e : langLinksList) {
				String text = e.getText();
				System.out.println(text);
				LinksList.add(text);
				}
				
				return LinksList;
			}
		

		public static void getFooterLinks(By locator) {
			List<WebElement> footerLinks = driver.findElements(locator);
			List<String> footerList = new ArrayList<String>();
			for (WebElement e : footerLinks) {
				String text = e.getText();
				footerList.add(text);
			}
			System.out.println(footerList);
		}
		
		
		
		
	}
	
	

