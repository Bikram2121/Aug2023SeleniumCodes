package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisabledTextFieldAndButton {

	public static void main(String[] args) {
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		
//		WebElement lastName= driver.findElement(By.xpath("//input[@placeholder='Enter Last name']"));
//		lastName.sendKeys("Roger");
//		System.out.println(lastName);
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/Tags/tryit.asp?filename=tryhtml_button_disabled");
		
		WebElement click =  driver.findElement(By.xpath("//button[text()='Click Me!']"));
		String disabledText = click.getAttribute("disabled");
		System.out.println(disabledText);
		
		click.click();
		
		
	}

}
