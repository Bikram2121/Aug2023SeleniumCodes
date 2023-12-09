package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		//SID - session id
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit(); // sid = 123
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		driver.close(); //sid 123
		System.out.println(driver.getTitle());
		//  NoSuchSessionException: invalid session id
		
		//System.out.println(driver.getTitle()); //sid = null
		
//		driver = new EdgeDriver(); //sid = 456
//		driver.get("https://google.com");
		

		
		

		
		
	}

}
