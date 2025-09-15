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
	
	@Test(groups= {"Smoke"})
	public void mobileLogInCarLoan() {
		System.out.println("mobileLogInCarLoan");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am number one");
	}
	
	//enabled=false -> will skip the test case
	@Test(enabled=false)
	public void mobileSingInCarLoan() {
		System.out.println("mobileSingInCarLoan");
	}
	
	// will not fail till 40 seconds of your execution
	@Test(timeOut=4000)
	public void mobileSignOutLoan() {
		System.out.println("mobileSignOutLoan");
	}
	
	
	// APICarLoan() depends on WebLogInCarLoan So WebLogInCarLoan execute first then APICarLoan
	@Test(dependsOnMethods= {"WebLogInCarLoan","mobileSignOutLoan"})
	public void APICarLoan() {
		System.out.println("APICarLoan");
	}

}
