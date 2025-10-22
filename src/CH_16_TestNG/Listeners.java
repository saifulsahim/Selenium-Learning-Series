package CH_16_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interface which implements testNG listeners
public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	    // TODO Auto-generated method stub
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    
		//System.out.println("Succesffuly executed Listeners pass code ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Succesffuly executed Listeners pass code "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	    // TODO Auto-generated method stub
	}



}
