package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CricInfoTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/53520/eng-vs-nz-1st-odi-new-zealand-tour-of-england-2023");
		Thread.sleep(4000);

		String pName = getWicketTakerName("Livingstone");
		System.out.println(pName);

		pName = getWicketTakerName("Stokes");
		System.out.println(pName);

		
	List<String> woakesScoreList= getScoreCardList("Stokes");
		System.out.println(woakesScoreList);
		
	}

	public static String getWicketTakerName(String batsmanName) {
		return driver
				.findElement(
						By.xpath("//a[contains(text(),'" + batsmanName + "')]/parent::div/following-sibling::div/span"))
				.getText();

	}

	public static List<String> getScoreCardList(String playerName) {

		List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()=' " + playerName
				+ " ']/parent::div/following-sibling::div[contains(@class , 'cb-col-8')]"));
		List<String> playerScoreList = new ArrayList<String>();
		for (WebElement e : scoreList) {
			String text = e.getText();
			playerScoreList.add(text);
		}
		return playerScoreList;
	}

}
