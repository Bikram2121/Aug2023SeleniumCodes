package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");

		List<WebElement> imagesList = driver.findElements(By.tagName("img11"));

		int imagesCount = imagesList.size();
		System.out.println(imagesCount);
//		int count = 0;
//
//		for (WebElement e : imagesList) {
//			e.getSize();
//			System.out.println(imgTxt);
//			count++;
//		}
//
//		System.out.println("total img count is : " + count);

	}

}