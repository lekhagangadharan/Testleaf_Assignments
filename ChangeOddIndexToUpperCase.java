package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		
		/*
		 Pseudo Code
		 
		   Declare String Input as Follow
		   String test = "changeme";
	       a) Convert the String to character array
		   b) Traverse through each character (using loop)
		   c)find the odd index within the loop (use mod operator)
		   d)within the loop, change the character to uppercase, if the index is odd else don't change
		   */
		
		String name = "testleaf";  //TeStLeAf
	
		char[] charArray = name.toCharArray();
		int length = charArray.length;
		
		
		for (int i = 0; i < length; i++) {
			if (i%2!=0) {
				
				charArray[i]= Character.toUpperCase(charArray[i]);
				
				
				
			}
			System.out.print(charArray[i]);
			
			
			
		}
		
	}

}
