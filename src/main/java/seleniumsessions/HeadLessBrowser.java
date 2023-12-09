package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//browser is not visible
		//headless - testing is happening behind the scenes
		//fast
		
		
		EdgeOptions eo = new EdgeOptions();
		//eo.setHeadless(true);
		//eo.addArguments("--headless");
		eo.addArguments("--inprivate");
		
		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
		
	}

}
