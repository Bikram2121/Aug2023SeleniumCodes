package testngassignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {

	@Test
	public void TitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Register Account");
	}

	@Test
	public void RegistrationURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

}
