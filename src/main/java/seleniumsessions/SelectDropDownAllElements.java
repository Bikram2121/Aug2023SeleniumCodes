package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		
//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size() - 1);
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Indonesia")) {
//				e.click();
//				break;
//			}
//		}
		
		By country = By.id("Form_getForm_Country");
		
		if (getTotalDropDownOptions(country)-1==232) {
			System.out.println("country dropdwon count is correct");
		}
		
		if (getDropDownOptionsTextList(country).contains("India")) {
			System.out.println("country is present");
		}
		
		List<String> expCountryList =  Arrays.asList("India" , "Brazil" , "Belgium");
		if (getDropDownOptionsTextList(country).containsAll(expCountryList)) {
			System.out.println("pass");
		}
		
		selectDropDownValue(country, "South Korea");
		
		
//		getDropDownOptionsList(country);
//		getDropDownOptionsTextList(country);
		
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public static int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options : " +optionsCount);
		return optionsCount;
	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	public static void selectDropDownValue(By locator , String expvalue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expvalue)) {
				e.click();
				break;
			}
			
		}
	}
	
	
	
}
