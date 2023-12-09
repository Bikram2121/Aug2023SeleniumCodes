package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("dgsaghjdsa");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("8/18/1995");
		
		driver.findElement(By.xpath("//textarea[@id='RESULT_TextArea-5']")).sendKeys("this is a desc...");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-8']")).sendKeys("Aryan");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-9']")).sendKeys("Berry");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-10']")).sendKeys("Berry");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-12']")).sendKeys("Mumbai");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-13']")));
		select.selectByVisibleText("Kentucky");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-14']")).sendKeys("789552");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-15']")).sendKeys("87982323213");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-16']")).sendKeys("asdas@gmail.com");
		
		driver.findElement(By.id("FSsubmit")).click();
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Get this form']")).click();
		
	}

}
