package CH16_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeCls()
	{
		System.out.println("Before executing any methods in the class");

	}
	@Test
	public void WebLogInCarLoan() {
		System.out.println("WebLogInCarLoan");
	}
	
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in Day 3 class");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after every test method in Day 3 class");
	}
	
	@AfterClass
	public void afterCls()
	{
		System.out.println("After executing all methods in the class");

	}
	
	@Test
	public void mobileLogInCarLoan() {
		System.out.println("mobileLogInCarLoan");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am number one");
	}
	
	@Test
	public void mobileSingInCarLoan() {
		System.out.println("mobileSingInCarLoan");
	}
	
	@Test
	public void mobileSignOutLoan() {
		System.out.println("mobileSignOutLoan");
	}
	
	@Test
	public void LogInCarLoan() {
		System.out.println("LogInCarLoan");
	}

}
