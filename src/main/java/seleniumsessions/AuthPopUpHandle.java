package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		String username = "admin";
		String password = "admin";

		driver.get("http://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
