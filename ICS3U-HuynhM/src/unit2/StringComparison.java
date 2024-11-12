package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: November 12, 2024
 * @author Myra Huynh
 */

class StringComparison {
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
		if(answer.compareTo("hello") > 0) {
			System.out.println("Your answer is less than hello");
		}
		
		//Example of equals()
		if(answer.equals("Toronto")) {
			System.out.println("You are correct.");
		}
		
		//Example of equalsIgnoreCase()
		if(answer.equalsIgnoreCase("TORONTO")) {
			System.out.println("You are correct!!!");
		}

		//What values does compareTo() return? How can we 
		//interpret the value?

		//what value does equals() and equalsIgnoreCase() return? 
		//What is the difference between these two functions?
	}
}