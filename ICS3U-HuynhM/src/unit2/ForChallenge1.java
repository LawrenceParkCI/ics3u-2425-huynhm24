package unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Description:
 * Date: December 1, 2024
 * @author Myra Huynh
 */

public class ForChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		 /*
	      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
	      ie.

	      Starting Num: 
	        0
	      Ending Num: 
	        1
	      Count by: 
	        0.1
	      Result: 
	        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
	    */
		
		
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		double startNum, endNum, countBy;

		//Gathering user input
		System.out.println("What is the starting number?");
		startNum = sc.nextDouble();
		
		System.out.println("What is the ending number?");
		endNum = sc.nextDouble();
		
		System.out.println("What should I count by?");
		countBy = sc.nextDouble();
		
		//Printing the results
		System.out.println("Starting number: " + startNum + "\nEnding number: " + endNum + "\nCount by: " + countBy);
		
		//Using a loop to get the results
		
		for (double num = startNum; num <= endNum; num += countBy) {
			System.out.println(num);
			
		}
		
		sc.close();
		

	}

}
