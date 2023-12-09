package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(2000);

		WebElement update = driver.findElement(By.xpath("//div[@id='droppable']/p"));

		System.out.println(update.getText());

	}

}
