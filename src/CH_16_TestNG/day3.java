package CH_16_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeCls()
	{
		System.out.println("Before executing any methods in the class");

	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLogInCarLoan(String urlName, String Key) {
		System.out.println("WebLogInCarLoan");
		System.out.println(urlName);
		System.out.println(Key); 
		
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
	
	@Test(dataProvider="getData")
	public void mobileSignOutLoan2(String username, String password) {
		System.out.println("mobileSignOutLoan2");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	// APICarLoan() depends on WebLogInCarLoan So WebLogInCarLoan execute first then APICarLoan
	@Test(dependsOnMethods= {"WebLogInCarLoan","mobileSignOutLoan"})
	public void APICarLoan() {
		System.out.println("APICarLoan");
	}
	@DataProvider
	public Object[][] getData()
	{
		/*
		 * 1st combination -> username password -> good credit history -> row
		 * 2nd combination-> username password -> no credit history 
		 * 3rd -> Fraudelent credit
		 * [3] -> 3 combinations
		 * [2] -> username & password
		 */
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] ="firstSetUserName";		
		data[0][1] ="password";		
		// Columns in the row are nothing but values for that particular combination 
		
		// 2nd set
		data[1][0] ="SecondSetUserName";		
		data[1][1] ="secondPassword";	
		
		// 3nd set
		data[2][0] ="ThirdSetUserName";		
		data[2][1] ="thirdPassword";	
		return data;
				
	}

}
