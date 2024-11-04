package unit2;
import java.util.Scanner;

/**
 * Description: This program determines if a number is positive or negative and divisible by 7. 
 * Date: November 4, 2024
 * @author Myra Huynh
 */
public class PositiveNegative {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Gathering user input
		System.out.println("Please enter a positive or negative integer:");
		int num = sc.nextInt();
		
		//Determining if number is positive or negative and printing the results 
		if(num >= 0) {
			System.out.println("This is a positive number!");
		}
		
		else {
			System.out.println("This is a negative number!");	
		}
		
		//Determining if number is divisible by 7 and printing the results
		if(num % 7 ==0) {
			System.out.println("This number is divisible by 7!");
		}
		
		else {
			System.out.println("This number is not divisible by 7!");
		}
		
		sc.close();

			}

}
