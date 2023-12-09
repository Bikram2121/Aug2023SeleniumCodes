package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomCSSSelector {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://app.hubspot.com/login/");

		List<WebElement> ele= driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn"));
		int impFieldsCount = ele.size();
		
		if (impFieldsCount==4) {
			System.out.println("pass");
		}
		
		
		
		
	}

}
