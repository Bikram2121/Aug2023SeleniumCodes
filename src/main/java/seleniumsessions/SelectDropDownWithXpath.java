package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.microchip.com/prochiplicensing/#/");

		// WebElement design = driver.findElement(By.xpath("//label[text()='When is your
		// design planned for production?']/preceding-sibling::select"));
		// WebElement design = driver.findElement(By.xpath("//label[text()='Which CPLD
		// will you be using?']/preceding-sibling::select"));
		WebElement design = driver.findElement(By.xpath(
				"//label[text()='What are the potential quantities per year(or total CPLD volume) you plan to use in your design(s)?']/preceding-sibling::select"));

		Select select = new Select(design);
		select.selectByVisibleText("1000 - 5000 units");

	}

}
