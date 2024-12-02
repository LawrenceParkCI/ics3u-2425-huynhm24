package unit2;

import java.util.Scanner;

/**
 * Description: This program tests using loops to get characters at different indexes;
 * Date: December 1, 2024
 * @author Myra Huynh
 */

public class StringLengthAndChars {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
	      Goal: Using string methods with a for loop
	        .length()
	        .charAt(<position>)
	    */
	    
	    String name = "Ms. Kemp";

	    //write comments for the following code - what does it print out, and why?
	    System.out.println(name.length());
	    //Prints 8
	    System.out.println(name.charAt(1));
	    //Prints s
	    System.out.println(name.charAt(2));
	    //Prints .
	    System.out.println(name.charAt(3));
	    //Prints a space
	  
	    //.length() gets the number of characters in the string
	    //.charAt(position) gets the character at a specific index in the string
	        //counting starts at 0

	    /**
	      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
	    */
	    
	    System.out.println("What is your name?");
	    String name1 = sc.nextLine();
	    
	    for (int index = 0; index < name1.length(); index ++) {
	    	System.out.println(name1.charAt(index));
	    }
	    
	    sc.close();

	}

}
