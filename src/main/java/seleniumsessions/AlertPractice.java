package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@title= 'Sign in']")).click();
		
		Alert alert = driver.switchTo().alert();
		String signInText = alert.getText();
		if (signInText.contains("Please enter a valid user name")) {
			System.out.println("pass");
			alert.accept();
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id= 'login1']")).sendKeys("sadasdsad");
		driver.findElement(By.xpath("//input[@title= 'Sign in']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		String pwdAlert = alert1.getText();
		if (pwdAlert.contains("Please enter your password")) {
			System.out.println("pass");
			alert1.accept();
		}
		
	}

}
