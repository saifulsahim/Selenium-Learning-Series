package CH_34_java_OOP_basics_part_1.Abstract;

public abstract class ParentAirCraft {
	public void engine()
	{
		System.out.println("Follow Engine guidelines");
	}
	
	public void safettyGuidLines()
	{
		System.out.println("Follow Safety guidelines");
	}
	
	public abstract void bodyColor();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
