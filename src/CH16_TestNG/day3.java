package CH16_TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void WebLogInCarLoan() {
		System.out.println("WebLogInCarLoan");
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
