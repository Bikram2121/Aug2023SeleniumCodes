package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		Boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
