package CH_34_java_OOP_basics_part_1;

public class print_min_number_in_2D_array2 {

	public static void main(String[] args) {
		int a [][]={{2,4,5}, {3,4,7},{1,8,10}};
		int min = a [0][0];
		//System.out.println(a.length);
		for(int i =0 ; i<a.length; i++)
		{
			//System.out.print("sssssssss"+a[i].length);
			for(int j=0; j<a[i].length;j++)
			{
				if(a[i][j] < min ) {
					min = a[i][j];
				}
				//System.out.print(a[i][j]);
			}
		}
		System.out.print(min);

	}
}
