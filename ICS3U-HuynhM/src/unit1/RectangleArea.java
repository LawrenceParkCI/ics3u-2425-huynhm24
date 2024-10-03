package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the Integer Variables worksheet.
 * Date: October 2, 2024
 * @author Myra Huynyh
 */

public class RectangleArea {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int length, width, depth;
		
		//get the user input
		System.out.println("AREA PROGRAM");
		
		System.out.println("Type in the length of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the recatngle and <Enter>:");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangular prism and <Enter>");
		depth = sc.nextInt();
		
		//Calculate the area
		int area = length * width; 
		
		//Print out the output
		System.out.println("The area of your rectangle is " + area + ".");
		sc.close();
		
		
		//Calculate the volume
		int volume = length * width * depth;
		
		//Print out the output
		System.out.println("The volume of your rectanglular prism is " + volume + "." );
		
		sc.close();
		

	}

}
