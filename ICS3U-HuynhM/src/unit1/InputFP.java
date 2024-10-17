package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the Floating-Point Variables worksheet.
 * Date: October 3, 2024
 * @author Myra Huynyh
 */

public class InputFP {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declare variables 
		double num1, num2; 
		
		//Gather and store user input
		System.out.println("Type in a decimal number and <Enter>");
		num1 = sc.nextDouble();
		
		System.out.println("Type in another decimal number and <Enter>");
		num2 = sc.nextDouble();
		
		System.out.println();
		
		//Print the output
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		
		sc.close();
		
			

	}

}
