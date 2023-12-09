package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {

		String browserName = "FF";
		String URL = "https://naveenautomationlabs.com/opencart/index.php?route=common/home";
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);

		brUtil.launchURL(URL);

		String actTitle = brUtil.getPageTitle();
		if (actTitle.equals("Your Store")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		String actURL = brUtil.getPageURL();
		if (actURL.contains("opencart")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		brUtil.quitBrowser();

	}

}
