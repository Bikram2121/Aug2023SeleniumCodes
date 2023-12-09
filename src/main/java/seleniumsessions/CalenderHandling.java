package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CalenderHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new EdgeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		// SelectCalenderDate("22");

		selectFutureDate("May 2024", "31");
		
		//selectPreviousDate("February 2020", "29");
		
		
	}
 
	public static void selectFutureDate(String expMonthYear, String day) {
		
//			if (expMonthYear.contains("February")&& Integer.parseInt(day)>=30) {
//				System.out.println("wrong day/date passed...please pass the right day/date for FEB month..." + day);
//				return;
//			}		
		
		if (expMonthYear.contains("February")&& Integer.parseInt(day)>30) {
			System.out.println("wrong day/date passed...please pass the right day/date for FEB month..." + day);
			return;
		}
		
		if (Integer.parseInt(day)>31) {
			System.out.println("wrong day/date passed...please pass the right day/date..." + day);
			return;
		}
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		
		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text() = 'Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);
		}
		selectDate(day);
	}

	
public static void selectPreviousDate(String expMonthYear, String day) {
		
//		if (expMonthYear.contains("February")&& Integer.parseInt(day)>30) {
//			System.out.println("wrong day/date passed...please pass the right day/date for FEB month..." + day);
//			return;
//		}
		
		if (expMonthYear.contains("February")&& Integer.parseInt(day)>=30) {
			System.out.println("wrong day/date passed...please pass the right day/date for FEB month..." + day);
			return;
		}
		
		if (Integer.parseInt(day)>31) {
			System.out.println("wrong day/date passed...please pass the right day/date..." + day);
			return;
		}
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		
		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);
		}
		selectDate(day);
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

	public static void SelectCalenderDate(String day) {
		List<WebElement> daysList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		for (WebElement e : daysList) {
			String text = e.getText();
			if (text.equals(day)) {
				e.click();
				break;
			}
		}
	}

	
	
	//div.DayPicker-Month div.DayPicker-Day--disabled -- only disabled dates from first month
	//div.DayPicker-Day--selected  -- current date
	//div.DayPicker-Day:not(.DayPicker-Day--outside)  -- dates from both the months 
	//div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled) -- only enabled dates from both the months
	
	
	
	
}
