package CH_34_java_OOP_basics_part_1;

import CH_34_java_OOP_basics_part_1.Inheritence.parentClassDemo;

public class functionOverriding extends parentClassDemo {
	
	public void audioSystem()
	{
		System.out.println("New engine code is implemeneted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOverriding od = new functionOverriding();
		od.audioSystem();
	}

}
