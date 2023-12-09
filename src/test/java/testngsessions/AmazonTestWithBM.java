package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestWithBM {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}

	@Test(priority = 3)
	public void searchExistTest()  {
		Boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 2)
	public void isHelpExistTest() {
		Boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
