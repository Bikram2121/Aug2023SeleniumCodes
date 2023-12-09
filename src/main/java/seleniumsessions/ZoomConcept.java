package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ZoomConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		zoomChrome("50%");

	}

	public static void zoomChrome(String zoomPercentage) {
		String zoom = "document.body.style.zoom='" + zoomPercentage + "'";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(zoom);
	}

	public static void zoomFirefox(String zoomPercentage) {
		String zoom = "document.body.style.MozTransform='scale" + zoomPercentage + ")'";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(zoom);
	}

}
