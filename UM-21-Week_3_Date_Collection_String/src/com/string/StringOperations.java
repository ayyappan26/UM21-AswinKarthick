package com.string;

/**
 * @author ashwin
 *	String Operations
 */
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Java World";
		char at5th = str.charAt(4); // Find character at an index
		System.out.println("Character at 5th position is " + at5th);
		String str1 = "Welcome";
		System.out.println(str.compareToIgnoreCase(str1)); //Lexicographically compare strings
		String str2 = str + " -Let us learn "; // String concatenation
		System.out.println(str2);
		int ind = str.indexOf("a") + 1; // Find the index of a character
		System.out.println("First occurance of a is at " + ind);
		String newstring = str.replace("a", "e"); // Replace a character with another
		System.out.println(newstring);
		String res = str.substring(4, 10); // Returns string between 4th position and 10th position
		System.out.println(res);
		System.out.println(str.toLowerCase());
	}

}
