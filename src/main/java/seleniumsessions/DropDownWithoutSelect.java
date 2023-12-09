package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");

		By country = By.id("Form_getForm_Country");
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		
		getDropDownValueWithText(options, "India");
		
		
//		List<WebElement> optionsList =  driver.findElements(options);
//		int optsionsSize = optionsList.size();
//		System.out.println(optsionsSize);
//		
//		for (WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		
		
		

		
		
		
		
	}
	
	public static void getDropDownValueWithText(By locator , String expValue) {
		List<WebElement> optionsList = driver.findElements(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
		}
	

}
