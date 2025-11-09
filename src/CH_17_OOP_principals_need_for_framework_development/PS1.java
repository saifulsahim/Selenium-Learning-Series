package CH_17_OOP_principals_need_for_framework_development;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1  extends PS{
	

	@Test
	public void testRun()
	{
		int a = 3;
		doThis();
		PS2 b = new PS2(3); // Parameterised constructor
		System.out.println(b.increment());
		System.out.println(b.decrement());
	}
	

}
