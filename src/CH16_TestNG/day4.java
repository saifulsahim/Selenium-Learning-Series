package CH16_TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebLogInHomeLoan(String urlName) {
		System.out.println("WebLogInPersonalLoan");
		System.out.println(urlName);
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
