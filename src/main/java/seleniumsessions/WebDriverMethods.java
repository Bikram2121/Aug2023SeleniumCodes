package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new EdgeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println("url is : " +url);
		if (url.contains("amazon")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		String pgSrc = driver.getPageSource();
		System.out.println(pgSrc);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
