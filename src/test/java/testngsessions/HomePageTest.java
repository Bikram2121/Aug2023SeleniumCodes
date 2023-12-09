package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	//Global pre conditions
	//pre condition
	//test cases ->test steps -> actual vs exp result-- Assertion
	//post steps
	//post global steps
	
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS-- start DB connection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT-- create user");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launch browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM--login to app");
	}
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}
	
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS--disconnectWithDB");
	}
	
	
	
}
