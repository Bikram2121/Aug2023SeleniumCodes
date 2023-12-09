package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("darkmagician7171@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Vikku@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
	
		selectUser("Tom Cruise");
		String compName = getUserCompanyName("Tom Cruise");
		System.out.println(compName);
		
		
	}

	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static String getUserCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	
}
