package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementNotPresent {

	static WebDriver driver;

	
	public static void main(String[] args) {
		
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImg = By.className("img-responsive111");
		By search = By.name("search");
		
		//webelement + perform action
		boolean flagImg = driver.findElement(logoImg).isDisplayed();
		System.out.println(flagImg);
		//FindElement - throws NoSuchElementException
		
	}

}
