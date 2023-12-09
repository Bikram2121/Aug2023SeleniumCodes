package testngassignment;

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

		if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("plz pass the correct browser : " + browserName);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
