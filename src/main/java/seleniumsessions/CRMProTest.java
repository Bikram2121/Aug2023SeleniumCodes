package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CRMProTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new EdgeDriver();
//		driver.get("https://classic.crmpro.com/");
//		
//		List<WebElement> paraText =  driver.findElements(By.tagName("p"));	
//		int para = paraText.size();
//		System.out.println(para);
//		
//		for (WebElement e : paraText) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		driver.get("https://ui.cogmento.com/contacts");
		
		driver.findElement(By.name("email")).sendKeys("darkmagician7171@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Vikku@123");
		driver.findElement(By.xpath("//div[contains(text() , 'Login')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]")).click();
		Thread.sleep(3000);
		
		By CheckBox= By.xpath("//a[contains(text(), 'Greta bitchass Thunberg')]/ancestor::td/preceding-sibling::td//input");
		
		Thread.sleep(3000);
		driver.findElement(CheckBox).click();
		
		
		
		
		
		
		
	}

}
