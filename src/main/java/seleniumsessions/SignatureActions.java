package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignatureActions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://signature-generator.com/draw-signature/");

		WebElement canvas = driver.findElement(By.id("signature-pad"));

		Actions act = new Actions(driver);

		act.click(canvas).moveToElement(canvas, 5, 7).clickAndHold(canvas).moveToElement(canvas, -100, -80)
				.moveByOffset(60, -60).moveByOffset(80, -80).moveByOffset(30, -30).moveByOffset(70, -70).release(canvas)
				.build().perform();

	}

}
