package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://google.com");
		System.out.println("child window title : " +driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title : " +driver.getTitle());
		
	}

}
