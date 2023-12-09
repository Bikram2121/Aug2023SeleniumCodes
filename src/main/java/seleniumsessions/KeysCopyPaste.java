package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysCopyPaste {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/createaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");

		WebElement firstName = driver.findElement(By.cssSelector("input#firstName"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		
		firstName.sendKeys("abcde");

		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		lastName.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
