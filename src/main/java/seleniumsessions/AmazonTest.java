package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "edge";
		String url = "https://amazon.com";

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		brUtil.launchURL(url);
		String actualTitle = brUtil.getPageTitle();
		if (actualTitle.contains("Amazon")) {
			System.out.println("title -- pass");
		} else {
			System.out.println("title--fail");
		}
		String actualUrl = brUtil.getPageURL();
		if (actualUrl.contains("amazon")) {
			System.out.println("url -- pass");
		} else {
			System.out.println("url--fail");
		}

		brUtil.quitBrowser();

	}

}
