package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("D:\\Proto.png");
	}
}
