package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return This returns the specific browser driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is : " + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ff":
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("please enter right browser : " + browserName);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url cannot be null");
		}

		if (url.indexOf("https") == 0) {
			driver.get(url);
		}
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Current URL is : " + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}

	}

}
