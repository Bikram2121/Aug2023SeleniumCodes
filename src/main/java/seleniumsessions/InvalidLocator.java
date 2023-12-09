package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class InvalidLocator {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/Tags/tryit.asp?filename=tryhtml_button_disabled");
		
		driver.findElement(By.xpath("////input[@@@id= @'name']")).sendKeys("sadxzx"); //InvalidSelectorException
		
		driver.findElement(By.xpath("//input[@id='vikkuname']")).sendKeys("sadxzx"); // NoSuchElementException
		
	}

}
