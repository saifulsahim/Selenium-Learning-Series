 package CH35_java_OOP_basics_part_2;

public class StaticVar {
	String name;
	String address;
	static String city;// class variables
	static int i;
	// Static block
	static {
		city = "Chittagong";
		i=0;
	}
	
	StaticVar(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	public void getAddress() {
		System.out.println(address + " " +city);
	}
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Sahim","Hillview");
		StaticVar obj1 = new StaticVar("Fahim","Agrabad");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=8;
		System.out.println(i);
	}

}
