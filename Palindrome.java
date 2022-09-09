package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String name = "madam";
		int length = name.length();
		
		String rev="";
		for (int i = length-1; i>=0; i--) {
			 rev=rev+name.charAt(i);
			
		}
		if (name.equals(rev)) {
			
			System.out.println(rev);
			
		}
		else
		{
			System.out.println(name + " -is not palindrome");
		}


	}

}
