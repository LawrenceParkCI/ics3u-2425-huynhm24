package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the String Variables worksheet.
 * Date: October 2, 2024
 * @author Myra Huynyh
 */

public class MakeLabels {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		//Creating the scanner object
		Scanner sc = new Scanner(System.in);
		
		//Creating variables that are assigned the value of the next line the user inputs
		
		String name;
		
		System.out.println("Type in the name and press <Enter>");
		name = sc.nextLine();
		
		String subject;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();
		
		//What the program outputs using the user input of name and subject 
		System.out.println();
		System.out.println("********************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("********************************");
		sc.close();
		

	}

}
