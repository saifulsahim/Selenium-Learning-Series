package CH_36_Collections_API;
import java.util.ArrayList;
public class codePractice {

	public static void main(String[] args) {
		int a[] ={ 4,5,5,5,4,6,6,9,4}; 
		// 4-3, 5-3, 6-2, 9-1
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i =0; i<a.length;i++)
		{
			int k =0;
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				System.out.println("ss"+ ab);
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						k++;
					}
					
				}
				System.out.println(a[i]);
				System.out.println(k);
			}
		}
	}
}
