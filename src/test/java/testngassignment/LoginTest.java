package testngassignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void LoginPageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test
	public void searchExistTest() {
		Boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
