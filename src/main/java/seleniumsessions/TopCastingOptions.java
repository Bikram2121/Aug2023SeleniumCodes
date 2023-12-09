package seleniumsessions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1. browser specific: cannot be used for cross browser
		// ChromeDriver driver = new ChromeDriver(); //only chrome
		// FirefoxDriver driver1 = new FirefoxDriver();//only ff

		// 2.WD = new CD() - valid and recommended top casting - local 	execution
		// WebDriver driver = new ChromeDriver();

		// 3. SearchContext = new CD() - valid but not recommended
		// SearchContext driver = new ChromeDriver();

		// RemoteWebDriver = new CD() - valid and recommended top casting
		// RemoteWebDriver driver = new ChromeDriver();

		// 5.WD = new RWD() - valid and recommended top casting and used for remote 
		// execution - GRID
		// WebDriver driver = new RemoteWebDriver(remoteAddress, Capabilities);

		// 6.SearchContext = new RWD() - valid but not recommended
		// SearchContext driver = new RemoteWebDriver(remoteAddress, Capabilities);

	}

}
