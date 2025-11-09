package CH_17_OOP_principals_need_for_framework_development;

public class PS2 {
	int a ;
	// Constructor name will be same as Class name
	public PS2(int a) {
		this.a = a;
	}
	// Default constructor
	public int increment()
	{
		a =a +1;
		return a;
	}
	public int decrement()
	{
		a =a -1;
		return a;
	}


}
