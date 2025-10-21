package Ch_36_Collections_API;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		//HashSet treeset, LinkedHashset implements Set interface 
		//does not accept duplicate values 
		// There is no guarantee elements stored in sequential order...random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("UAE");
		hs.add("UAE");
		hs.remove("UAE");
		hs.isEmpty();
		hs.size();
		System.out.println(hs);	
	}
}
