package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

		// driver.findElement(By.id("pizza")).sendKeys("Pizzahut");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pizza = (WebElement) js.executeScript(
				"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");

		pizza.sendKeys("pizzahut");
		
		WebElement un = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		
		un.sendKeys("DarkMagician");

	}

}
