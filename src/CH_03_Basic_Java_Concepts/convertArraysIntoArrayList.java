package CH_03_Basic_Java_Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArraysIntoArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");

		//System.out.println(a.get(3));

		for(int i =0;i<a.size();i++)
		{
		    //System.out.println(a.get(i));
		}
		System.out.println("************");
		for( String val :a)
		{
		    //System.out.println(val);
		}

		//item is present in ArrayList
		//System.out.println(a.contains("selenium"));
		String[] name = {"rahul", "shetty", "selenium"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("selenium"));

	}

}
