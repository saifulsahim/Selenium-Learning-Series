package CH_03_Basic_Java_Concepts;

public class StringAndItsMethods {

	public static void main(String[] args) {
		String s5 = "hello";
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		
		for( String val :splittedString) // Enhanced loop
		{
		    //System.out.println(val);
		}
		//System.out.println(splittedString[1].trim());
		
		// printing every character
		for (int i = 0; i < s.length(); i++) {
			//System.out.println(s.charAt(i));
		}

		// printing every character in reverse
		for (int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
