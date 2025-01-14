package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the Character Variables worksheet.
 * Date: October 3, 2024
 * @author Myra Huynyh
 */

public class InputChars {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		char ch1, ch2, ch3;
		
		//Gathering user input
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		
		//Storing user input
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		
		//Printing the output
		System.out.println("Together these 3 letters spell: " + (ch1 + ch2 + ch3));	
		
		sc.close();

	}

}
