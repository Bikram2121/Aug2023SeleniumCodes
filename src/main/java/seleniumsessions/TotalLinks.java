package seleniumsessions;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");

		// find all the links
		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		// print the total links count

		int linksCount = linksList.size();
		//int nonEmptyLinksCount = 0;

		// print the text of each link
		// and avoid the blank text
		// get total blank links count

//		for (int i = 0; i < linksCount; i++) {
//			String text = linksList.get(i).getText();
//
//			if (text.length() > 0) {
//				System.out.println(i + ":" + text);
//				nonEmptyLinksCount++;
//			}
//		}
//		

//		int blankLinksCount = linksCount - nonEmptyLinksCount;
//		System.out.println("total blank links is : " + blankLinksCount);

		System.out.println("=========================================================================================");
		
		// for each:
		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() > 0) {
				System.out.println(text);
			}
			count++;
		}
		System.out.println("The indexes are : " + count);

	}

}