package unit2;

import java.util.Scanner;
/**
 * Description: This program tests if a number is odd or even. 
 * Date: November 1, 2024
 * @author Myra Huynh
 */
public class OddEven {
	/**
	 * This is the entry point of the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating a variable
		int num;
		
		//Gather user input
		System.out.println("Please enter a whole number: ");
		num = sc.nextInt();
		
		//Calculate and print the output
		num = num % 2;
		
		if (num == 0) {
			System.out.println("This is an even number!");
		}
		
		else {
			System.out.println("This is an odd number!");
		}
		
		sc.close();

	}

}
