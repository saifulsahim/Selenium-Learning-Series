package CH_34_java_OOP_basics_part_1;

public class print_min_number_from_above_matrix_in_2D_array2 {

	public static void main(String[] args) {
		int a [][]={{2,4,5},{3,2,10},{1,2,0}};
		int min = a [0][0];
		int mincoloumn = 0;
		//System.out.println(a.length);
		for(int i =0 ; i<a.length; i++)
		{
			//System.out.print("sssssssss"+a[i].length);
			for(int j=0; j<a[i].length;j++)
			{
				if(a[i][j] < min ) {
					min = a[i][j];
					mincoloumn=j;
				}
				//System.out.print(a[i][j]);
			}
		}
		int max=a[0][mincoloumn];
		int k = 0;
		while(k<3)
		{
		if(a[k][mincoloumn]>max)
		{
		max=a[k][mincoloumn];
		}
		k++;
		}

		System.out.println(max);
		}

	}

