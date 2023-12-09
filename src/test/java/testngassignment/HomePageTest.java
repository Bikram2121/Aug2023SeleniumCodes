package testngassignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

	@Test
	public void HomePageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}

	@Test
	public void ButtonTextTest() {
		String text = driver.findElement(By.cssSelector("span#cart-total")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "0 item(s) - $0.00");
	}

}
