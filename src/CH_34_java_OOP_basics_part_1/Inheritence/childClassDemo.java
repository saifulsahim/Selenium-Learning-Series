package CH_34_java_OOP_basics_part_1.Inheritence;

public class childClassDemo extends parentClassDemo {
	
	public void engine()
	{
		System.out.println("New Engine");
	}
	public void color()
	{
		System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo cd = new childClassDemo();
		cd.color();
	}

}
