package CH16_TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void Demo() {
		System.out.println("Day 2");
	}
	
	@BeforeTest 
	public void preRequisite() {
		System.out.println("I will execute first");
	}
	
		

}
