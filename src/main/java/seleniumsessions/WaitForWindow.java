package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By twitter = By.xpath("//a[contains(@href , 'twitter')]");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickWhenReady(10,twitter);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID= it.next();
		System.out.println("parent window id : " + parentWindowID);
		
		String childWindowID= it.next();
		System.out.println("child window id : " + childWindowID);
		
		//switching to window:
		
		 driver.switchTo().window(childWindowID);
		 System.out.println("child window url : " +driver.getCurrentUrl());
		 
		 driver.close(); // close the child window
		 
		 driver.switchTo().window(parentWindowID);
		 
		 System.out.println("parent window url : " + driver.getCurrentUrl());
		
		
	}

}
