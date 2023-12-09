package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {

	public WebDriver driver;

//	public boolean doLogin(String userName, String password) {
//		driver.findElement(By.id("input-email")).clear();
//		driver.findElement(By.id("input-email")).sendKeys(userName);
//		driver.findElement(By.id("input-password")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//
//		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errorMsg);
//		if (errorMsg.contains("No match for E-Mail Address and/or Password.")) {
//			return true;
//		}
//		return false;
//	}

	public boolean doRegistration(String fn, String ln, String email, String telephone, String password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fn);

		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(ln);

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);

		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);

		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(password);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String userCreatedMsg = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(userCreatedMsg);

		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//div/a[text()='Register']")).click();

		if (userCreatedMsg.contains("Account Has Been Created!")) {
			return true;
		}
		return false;

	}

//	@DataProvider
//	public Object[][] getLoginNegativeData() {
//		return new Object[][] { { "adasd", "xhkad" }, { "vcxnkads", "hkdahs81" }, { " ", "bbcxnc" },
//				{ "dsadzczxcqweqeq", " " }, };
//
//	}

	@DataProvider
	public Object[][] getRegPageData() {
		return new Object[][] { { "uudgiczfvzyrrr", "srvrsddagyfttazr", "noogrsdfgyqvb@gmail.com", "755707636158676", "hdjkdfjvryasggdgyssdf" },
				{ "daznbwqyvmczcn", "oistyasdpaqawv", "z2mioy@gmail.com", "8765456786764", "lzlzkkykkjasff" },

		};
	}

	@Test(dataProvider = "getRegPageData")
	public void registerTest(String fn, String ln, String email, String telephone, String password)
			throws InterruptedException {
		boolean flag = doRegistration(fn, ln, email, telephone, password);
		Assert.assertTrue(flag);
		Thread.sleep(2000);
	}

//	@Test(dataProvider = "getLoginNegativeData")
//	public void loginTest(String userName, String password) {
//
//		boolean flag = doLogin(userName, password);
//		Assert.assertTrue(flag);
//	}

	@BeforeTest
	public void setup() {
		driver = new EdgeDriver();
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

}
