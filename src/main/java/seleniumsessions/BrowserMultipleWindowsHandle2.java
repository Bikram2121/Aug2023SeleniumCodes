package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMultipleWindowsHandle2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();

		Thread.sleep(3000);

		WebElement twtEle = driver.findElement(By.xpath("//a[contains(@href , 'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href , 'facebook')]"));
		WebElement lnkdinEle = driver.findElement(By.xpath("//a[contains(@href , 'linkedin')]"));
		WebElement ytubeEle = driver.findElement(By.xpath("//a[contains(@href , 'youtube')]"));

		twtEle.click();
		Set<String> twthandles = driver.getWindowHandles();
		Iterator<String> twtit = twthandles.iterator();
		String twtID = twtit.next();
		driver.switchTo().window(twtID);
		System.out.println("twitter url is : " + driver.getTitle());
		Thread.sleep(2000);
		
		
		driver.switchTo().window(parentWindowId);
		//System.out.println("parent url is : " + driver.getCurrentUrl());

		fbEle.click();
		Set<String> fbhandles = driver.getWindowHandles();
		Iterator<String> fbit = fbhandles.iterator();
		String fbID = fbit.next();
		driver.switchTo().window(fbID);
		System.out.println("facebook url is : " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(parentWindowId);
		//System.out.println("parent url is : " + driver.getCurrentUrl());

		lnkdinEle.click();
		Set<String> lnkhandles = driver.getWindowHandles();
		Iterator<String> lnkit = lnkhandles.iterator();
		String lnkdinID = lnkit.next();
		driver.switchTo().window(lnkdinID);
		System.out.println("LinkedIn url is : " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(parentWindowId);
		//System.out.println("parent url is : " + driver.getCurrentUrl());

		ytubeEle.click();
		Set<String> ythandles = driver.getWindowHandles();
		Iterator<String> ytit = ythandles.iterator();
		String ytubeID = ytit.next();
		driver.switchTo().window(ytubeID);
		System.out.println("Youtube url is : " + driver.getTitle());
		Thread.sleep(2000);

		driver.switchTo().window(parentWindowId);
		System.out.println("parent url is : " + driver.getCurrentUrl());
		
		
	}

}
