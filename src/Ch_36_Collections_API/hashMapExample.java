package Ch_36_Collections_API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "World");
		hm.put(2, "Sahim");
		hm.put(3, "Fahim");
		//System.out.println(hm); // Output : {0=Hello, 1=World, 2=Sahim, 3=Fahim}
		//hm.remove(2);
		
		// Entry Set
//		
		Set sn = hm.entrySet();
		Iterator it =sn.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			/*
			 * Output : 0=Hello 1=World 2=Sahim 3=Fahim
			 */
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		 

	} 

}
