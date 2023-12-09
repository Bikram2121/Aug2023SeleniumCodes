package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FooterSectionConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<String> infoSecList = getFooterSectionList("Information");
		System.out.println(infoSecList);
		
		
	}

	public static List<String> getFooterSectionList(String sectionName) {
		List<WebElement> sectionsList = driver
				.findElements(By.xpath("//h5[text() = '"+sectionName+"']/following-sibling::ul//a"));
		System.out.println(sectionsList.size());
		List<String> secValList = new ArrayList<String>();

		for (WebElement e : sectionsList) {
			String text = e.getText();
			secValList.add(text);
		}
		
		return secValList;
	}

}
