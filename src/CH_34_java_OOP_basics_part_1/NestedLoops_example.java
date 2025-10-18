package CH_34_java_OOP_basics_part_1;

public class NestedLoops_example {

	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
				//j++;
			}
			System.out.println("");

		}
	}
}
