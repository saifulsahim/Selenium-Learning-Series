package CH16_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class runTestCaseWithoutJavaCompiler {
	
	/*
	 * How to run tests with TestNG? 
	 * 1. You need to have @Test Annotation followed by methods
	 * 
	 * 2. You can define multiple tests from single class
	 * 3. In TestNG , every method is counted as a test case
	 */
	@AfterTest
	public void lastExecution() {
		System.out.println("i will be executing last");
	}
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
 
	@Test
	public void ndTest()  
	{
		System.out.println("bye");
	}
}
