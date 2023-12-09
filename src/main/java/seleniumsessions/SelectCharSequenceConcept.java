package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectCharSequenceConcept {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement email = driver.findElement(By.id("input-email"));

		// StringBuilder, StringBuffer, String, Keys

		StringBuilder username = new StringBuilder().append("Vikram").append(" ").append("auto").append(" ")
				.append("labs").append(" ").append("selenium");

		String space = " ";

		StringBuilder userInfo = new StringBuilder().append("Test").append(" ").append("web driver");

		String author = "Vikram";

		email.sendKeys(username, space, userInfo, space, author, Keys.TAB); 

	}

}
