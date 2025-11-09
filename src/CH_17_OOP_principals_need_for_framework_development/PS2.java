package CH_17_OOP_principals_need_for_framework_development;

public class PS2 extends PS3{
	int a ;
	// Constructor name will be same as Class name
	public PS2(int a) {  // int a is a instance variable
		super(a); // parent class constructor is invoked
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
