package testngassignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPasswordTest extends BaseTest {

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Forgot Your Password?");
	}

	public void textBoxExistTest() {
		Boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
		Assert.assertTrue(flag);
	}

}
