package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);

		// single selection:
//		while (true) {
//			if (driver.findElements(By.xpath("//td[text()='Russia']")).size() > 0) {
//				selectCountry("Russia");
//				break;
//				
//
//			} else {
//				// pagination logic:
		
//				WebElement next = driver.findElement(By.linkText("Next"));
//			
//				if (next.getAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over...country is not found");
//					break;
//				}
//				next.click();
//				Thread.sleep(2000);
//			}
//
//		}

		// multi selection:
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectMultipleCountry("India");
			}
			//pagination logic:
			
			WebElement next = driver.findElement(By.linkText("Next"));
			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over...country is not found");
				break;
			}
			next.click();
			Thread.sleep(2000);
		}

	}

	public static void selectMultipleCountry(String countryName) {
		List<WebElement> checkBoxList = driver.findElements(
				By.xpath("(//td[text()='" + countryName + "'])/preceding-sibling::td/input[@type='checkbox']"));

		for (WebElement e : checkBoxList) {
			e.click();
		}

	}

	public static void selectCountry(String countryName) {
		driver.findElement(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type ='checkbox']")).click();

	}

}
