package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int headerCount = getTableHeaderCount();
		System.out.println(headerCount);

		int rowCount = getRowCount();
		System.out.println(rowCount);

		// table[@id="customers"]/tbody/tr[2]/td[1]
		// table[@id="customers"]/tbody/tr[3]/td[1]
		// table[@id="customers"]/tbody/tr[7]/td[1]

		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		String afterXpath2 = "]/td[2]";
		
		

		for (int row = 2; row <= 7; row++) {
			String xPath = beforeXpath + row + afterXpath;
			//System.out.println(xPath);
			String val = driver.findElement(By.xpath(xPath)).getText();
			System.out.println(val);
		}

		
		for (int row = 2; row <= 7  ; row++) {
			String xPath = beforeXpath + row + afterXpath2;
			//System.out.println(xPath);
			String val = driver.findElement(By.xpath(xPath)).getText();
			System.out.println(val);
		}
		
		
	}

	public static int getTableHeaderCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}

	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size() - 1;
	}

}
