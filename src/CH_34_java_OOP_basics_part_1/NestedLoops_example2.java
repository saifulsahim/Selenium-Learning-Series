package CH_34_java_OOP_basics_part_1;

public class NestedLoops_example2 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				System.out.print("\t");
				i++;
			}
			System.out.println("");

		}
	}
}
