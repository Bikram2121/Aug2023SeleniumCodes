package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");

		Thread.sleep(5000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));

		String svgXpath = "//*[local-name() = 'svg' and @id = 'map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		String oregonXPath = "//*[local-name() = 'svg' and @id = 'map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='oregon']//*[name()= 'g' and @class='subregion']//*[name()='path']";
		String floridaXPath = "//*[local-name() = 'svg' and @id = 'map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @id='florida']//*[name()= 'g' and @class='subregion']//*[name()='path']";

		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);

		for (WebElement e : statesList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);

			if (stateName.equals("Florida")) {
				Thread.sleep(2000);
				int x = e.getSize().getWidth();
				int y = e.getSize().getHeight();
				System.out.println(x + " : " + y);

				act.moveToElement(e, (x / 2) - 40, 0).click().build().perform();
				break;
			} else if (stateName.equals("Oregon")) {
				e.click();
				break;
			}

		}

		List<WebElement> countyList = driver.findElements(By.xpath(oregonXPath));
		System.out.println(countyList.size());

		for (WebElement e : countyList) {
			String countyName = e.getAttribute("name");
			System.out.println(countyName);

			if (countyName.equals("Crook County")) {
				e.click();
				break;
			}

		}

	}

}
