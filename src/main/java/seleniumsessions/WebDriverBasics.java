package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// 1. open the browser: edge,chrome,safari
		// EdgeDriver driver = new EdgeDriver();

		String browser = "Edge";
		WebDriver driver = null;

		// cross browser logic

//		if (browser.equals("Edge")) {
//			driver = new EdgeDriver();
//		} else if (browser.equals("FF")) {
//			driver = new FirefoxDriver();
//		} else {
//			System.out.println("plz pass the correct browser :" + browser);
//		}

		// 2nd way : Assignment
		switch (browser) {
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "FF":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("plz pass the correct browser : " + browser);
			break;
		}

		// 2. enter the url:
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		// 3. get the title:
		String actualTitle = driver.getTitle();
		System.out.println("page title is : " + actualTitle);

		// validation point/checkpoint:
		if (actualTitle.equals("Your Store")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// Automation steps + Validation / Assertions = AUtomation Testing

		// 4. close the browser:
		driver.quit();

	}

}
