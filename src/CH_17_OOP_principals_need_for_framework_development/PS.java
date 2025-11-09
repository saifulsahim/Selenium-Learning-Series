package CH_17_OOP_principals_need_for_framework_development;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Run me first");
	}

	public void doThis()
	{
		System.out.println("I am here");
	}
	@AfterMethod
	public void afterRun()
	{
		System.out.println("Run me last");
	}

}
