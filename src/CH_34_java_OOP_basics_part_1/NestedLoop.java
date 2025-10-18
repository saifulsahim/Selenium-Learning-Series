package CH_34_java_OOP_basics_part_1;

public class NestedLoop {

	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i < 4; i++) // (outer for loop) this block will loop for 4 times
		{
			// System.out.println( "outer loop started");
			for (int j = 1; j <= 4 - i; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}
}
