package CH_34_java_OOP_basics_part_1.Abstract;

public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safettyGuidLines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the vody");
		
	}

}
