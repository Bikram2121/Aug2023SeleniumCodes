package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PseudoElementConcept {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		
		String mand_field = js.executeScript(script).toString();
		System.out.println(mand_field);
		
		if (mand_field.contains("*")) {
			System.out.println("it is a mandatory field");
		}
		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"), '::before').getPropertyValue('content')


	}

}
