package testngsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeTest
	public void setup(String url, String browserName) {
		System.out.println("running test on : " + browserName);
		if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Pass the correct browser : " + browserName);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
