package unit1;
import java.util.Scanner; 
/**
 * Description: This program contains part 3 of assignment 2, using different string methods. 
 * Date: October 8, 2024
 * @author Myra Huynh
 */

public class StringManipulation {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Gathering user input
		System.out.println("Please input and sentence and <Enter>");
		String string = sc.nextLine();
		
		//Output results using string methods
		System.out.println(string);
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.length());
		System.out.println(string.charAt(5));
		
		//Bonus 1
		int i = string.indexOf(" ");
		System.out.println(string.substring(0,i));
		

		sc.close();


	}

}
