package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. absolute xpath = /html/body/header/div/div/div[2]/div/input
		//2. relative xpath = custom xpath
		
		//assignment:
		By fogotPwd = By.xpath("//a[text() = 'Forgotten Password']");
		int fSize = driver.findElements(fogotPwd).size();
		if (fSize == 2) {
			System.out.println("PASS");
			System.out.println(fSize);
		}
		
		
		
		
	}

}
