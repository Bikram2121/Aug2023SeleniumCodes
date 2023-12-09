 package seleniumsessions;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
			
		WebDriver driver = new EdgeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1"); //f1
		driver.findElement(By.id("inp_val")).sendKeys("abc");
		
		driver.switchTo().frame("pact2"); //f2
		driver.findElement(By.id("jex")).sendKeys("efg");
		
		driver.switchTo().parentFrame(); //f1
		driver.findElement(By.id("inp_val")).sendKeys("ABC");
		
		
		driver.switchTo().frame("pact2"); //f2
		driver.switchTo().frame("pact3");//f3
		driver.findElement(By.id("glaf")).sendKeys("hij");
		
		driver.switchTo().parentFrame(); //f2
		driver.switchTo().parentFrame(); //f1
		driver.findElement(By.id("inp_val")).sendKeys("usau");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='One on One Call Support']")).click();
		

	}

}
