package CH_34_java_OOP_basics_part_1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a [][]={{2,4,5}, {3,4,7},{9,8,10},{11,12,13}};
		//System.out.println(a.length);
		for(int i =0 ; i<a.length; i++)
		{
			System.out.print("sssssssss"+a[i].length);
			for(int j=0; j< a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}
