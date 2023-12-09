package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProductSearchTest {

	public WebDriver driver;

	public boolean doProdSearch(String searchKey, String prodName) {
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(searchKey);
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		driver.findElement(By.cssSelector("h4")).click();

		String prodMatchMsg = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(prodMatchMsg);

		if (prodMatchMsg.contains("Products meeting the search criteria")) {
			return true;
		}
		return false;
	}

	@DataProvider
	public Object[][] getProdData() {
		return new Object[][] { { "macbook", "MacBook Pro" }, { "apple", "Samsung SyncMaster 941BW" },
				{ "htc", "HTC Touch HD" }, };
	}

	@Test(dataProvider = "getProdData")
	public void prodSeacrhTest(String searchKey, String prodName) {
		boolean flag = doProdSearch(searchKey, prodName);
		Assert.assertTrue(flag);

	}

	@BeforeTest
	public void setup() {
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}
}