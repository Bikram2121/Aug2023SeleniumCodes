package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");

		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));

		int width = slider.getSize().getWidth();
		System.out.println(width);

		Actions act = new Actions(driver);
//		act.clickAndHold(slider).moveToElement(slider, -((width / 2)-30), 0).click().build().perform();
		act.clickAndHold(slider).moveByOffset((width/2)-40, 0).click().build().perform();

//		act.clickAndHold(slider)
//		.moveToElement(slider, 90, 0)
//		.moveByOffset(50,0)
//		.moveByOffset(-20, 0)
//		.moveByOffset(-10,0)
//		.moveByOffset(70, 0)
//		.release(slider)
//		.build().perform();

	}

}
