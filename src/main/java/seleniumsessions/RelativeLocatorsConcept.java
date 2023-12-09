package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.linkText("Wood Buffalo, Canada"));
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		String aboveCity = driver.findElement(with(By.tagName("p")).above(element)).getText();
		String belowCity = driver.findElement(with(By.tagName("p")).below(element)).getText();
		String nearEle = driver.findElement(with(By.tagName("a")).near(element)).getText();

		
		System.out.println(rightIndex);
		System.out.println(leftRank);
		System.out.println(aboveCity);
		System.out.println(belowCity);
		System.out.println(nearEle);
	}

}
