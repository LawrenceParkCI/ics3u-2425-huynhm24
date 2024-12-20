package unit2;

import java.util.Scanner;

/**
 * Description: This program tests string comparison functions. 
 * Date: November 12, 2024
 * @author Myra Huynh
 */

class StringComparison {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?
		// No matter what I type, the output always says I'm incorrect
		
		/*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo(): This compares two string values lexicographically and returns a value that is positive, negative, or 0 depending if the first string is less than, greater than or equal to the second string. 
        .equals(): This compares the two strings to see if they are the same. 
        .equalsIgnoreCase(): This compares the two strings to see if they are the same not taking case into account. 
		 */
		
		//Example of compareTo()
		System.out.println(answer.compareTo("hello"));
		
		
		//Example of equals()
		System.out.println(answer.equals("hello"));
		
		//Example of equalsIgnoreCase()

		
		System.out.println(answer.equalsIgnoreCase("hello"));
		
		//What values does compareTo() return? How can we 
		//interpret the value?
		

		/*
		 * compareTo() returns a number value which can be positive or negative. 
		 * This value is calculated by the difference between the ascii value of the first letters of the first and second string (in that order)
		 * If the number returned is negative, the first string comes before the second and if the number is negative the second string comes before the first. 
		 * If the number returned is 0, the strings are equal
		 */
		
		//what value does equals() and equalsIgnoreCase() return? 
		//true or false
		
		//What is the difference between these two functions?
		//Just equals() will compare the two strings including the case of the letters, but equalsIgnoreCase() will compare the two strings without considering the case. 
		
		in.close();
	}
}