package CH16_TestNG;

import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebLogInHomeLoan() {
		System.out.println("WebLogInHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogInHomeLoan() {
		System.out.println("mobileLogInHomeLoan");
	}
	
	
	@Test
	public void LogInHomeLoan() {
		System.out.println("LogInHomeLoan");
	}

}
