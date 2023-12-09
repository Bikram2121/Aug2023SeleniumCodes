package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocatorsConcept1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(2000);

		WebElement ele =  driver.findElement(By.id("input-email"));
		
		String emailText = driver.findElement(with(By.tagName("label")).above(ele)).getText();
		System.out.println(emailText);
		
		
		String ret_Cust_Text =  driver.findElement(with(By.tagName("h2")).near(ele)).getText();
		System.out.println(ret_Cust_Text);
		
		
	}

}
