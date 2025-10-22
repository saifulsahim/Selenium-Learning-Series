package CH_34_java_OOP_basics_part_1;

public class functionOverloading {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		functionOverloading fo = new functionOverloading();
		fo.getData(2);
		fo.getData("hello");
		fo.getData(5, 6);

	}

}
