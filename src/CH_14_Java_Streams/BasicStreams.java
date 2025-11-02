package CH_14_Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicStreams {
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		//System.out.println(count);
	}

	//@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		Long c = names.stream().filter(s->s.startsWith("A")).count(); // datatype of count is long
		System.out.println(c);
		
		/*  There is no life for intermediate operation if there is no terminal operation
		 *  Terminal operation will execute only if inter op(filter) returns true
		 *  We can create stream
		 *  how to use filter in Stream API 
		 */
		
		long d = Stream.of("Sahim","Fahim","Tasnim","Miqdad").filter(s->
		{
			s.startsWith("S");
			return true;
		}).count();
		//.out.println("ss"+d);
		
		// print all name of ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s)); // limiting result
	}
	@Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		
		// print names which have last letter as "a" with Uppercase
		Stream.of("Sahim","Fahim","Tasnim","Miqdad","Awsaf").filter(s->s.endsWith("m")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		// print names which have last letter as "a" with Uppercase and sorted
		List<String> names1= Arrays.asList("Sahim","Fahim","Tasnim","Miqdad","Awsaf");
		names1.stream().filter(s->s.endsWith("m")).sorted().map(s->s.toUpperCase())
					.forEach(s->System.out.println(s));
		
		// concatenation of two streams
		Stream<String> newStream= Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Sahim"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	//@Test
	public void streamCollect() {
		List<String> ls  = Stream.of("Sahim","Fahim","Tasnim","Miqdad","Awsaf").filter(s->s.endsWith("m")).map(s->s.toUpperCase())
						 .collect(Collectors.toList());
		//System.out.println(ls.get(2));
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		// print unique number from this array
		// sort the array - 3rd index-1,2,3,5,7,9
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
	/* 
	 * Java Stream s-> s. left side is parameter right side is actions
	 * 
	 * What are Streams?
	 * 
	 * Stream API is a new feature available from Java 8. By using streams, we can
	 * perform various aggregate operations on the data returned from collections
	 * classes by drastically reducing the complexity of code.
	 * 
	 * What is Lambda Expression?
	 * 
	 * Lambda expressions introduce the new arrow operator -> into Java. It divides
	 * the lambda expressions in two parts:
	 * 
	 * The left side specifies the parameters required by the expression, which
	 * could also be empty if no parameters are required.
	 * 
	 * The right side is the lambda body which specifies the actions of the lambda
	 * expression.
	 * 
	 * The working of stream can be explained in three stages:
	 * 
	 * Create a stream
	 * 
	 * Perform intermediate operations on the initial stream to transform it into
	 * another stream and so on on further intermediate operations.
	 * 
	 * Perform terminal operation on the final stream to get the result.
	 * 
	 * An important characteristic of intermediate operations is laziness. When
	 * executing this code snippet, nothing is printed to the console. That is
	 * because intermediate operations will only be executed when a terminal
	 * operation is present.
	 * 
	 * Note:
	 * 
	 * The aggregate operations that we perform on the collection, array or any
	 * other data source do not change the data of the source, they simply return a
	 * new stream.
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
