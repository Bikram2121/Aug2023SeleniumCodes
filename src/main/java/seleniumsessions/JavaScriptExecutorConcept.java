package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//driver.get("https://app.hubspot.com/login/");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		js.executeScript("alert('hi alert');");
		
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		
		//jsUtil.generateAlert("alertyyy");
		
		//jsUtil.generateConfirmPopUp("hello");
		
		//jsUtil.refreshBrowserByJS();
		
//		 String pageText = jsUtil.getPageInnerText();
//		 System.out.println(pageText);
//		
//		 if (pageText.contains("Help")) System.out.println(true);
	
		
		WebElement un = driver.findElement(By.id("nav-orders"));
//		jsUtil.drawBorder(un);
		
//		WebElement form = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(form);
		
//		jsUtil.flash(un);
		
//		jsUtil.scrollPageDown();
//		jsUtil.scrollPageUp();
//		
//		jsUtil.scrollPageDown("200");
//		jsUtil.scrollPageDownMiddlePage();
		
		
//		WebElement drugStore = driver.findElement(By.xpath("//span[text()='Frequently repurchased in Drugstore']"));
//		
//		jsUtil.scrollIntoView(drugStore);
		
		jsUtil.clickElementByJS(un);
		
		
		
	}

}
