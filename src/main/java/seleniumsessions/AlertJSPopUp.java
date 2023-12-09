package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertJSPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		//alert.accept();
		//alert.dismiss();
		
		
//		alert.sendKeys("hello");
//		alert.accept();
		
		alert.accept();
		
	}

}
