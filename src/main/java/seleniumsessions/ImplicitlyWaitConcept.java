package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
			WebDriver driver = new EdgeDriver();	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//global wait:
			
			
			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //5 second implicit rule
			
			driver.findElement(By.id("input-email11")).sendKeys("dasdsa");
			driver.findElement(By.id("input-password")).sendKeys("daszzzsa");

	}

}
