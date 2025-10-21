package Ch_36_Collections_API;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
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

/*
 * 1. Synchronization or Thread Safe: This is the most important difference
 * between two. HashMap is non synchronized and not thread safe. On the other
 * hand, HashTable is thread safe and synchronized. When to use HashMap? Answer
 * is if your application do not require any multi-threading task, in other
 * words HashMap is better for non-threading applications. HashTable should be
 * used in multithreading applications.
 * 
 * 2. Null keys and null values:
HashMap allows one null key and any number of null values, while HashTable do not allow null keys and null values in the HashTable object.

3. Iterating the values:
HashMap object values are iterated by using iterator. HashTable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
 */
