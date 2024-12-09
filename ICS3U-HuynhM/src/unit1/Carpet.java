package unit1;
import java.util.Scanner; 
/**
 * Description: This program contains part 4 of assignment 2, finding cost. 
 * Date: October 8, 2024
 * @author Myra Huynh
 */

public class Carpet {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		int length, width, area;
		double cost, totalCost;
		
		//Gathering user input
		System.out.println("Enter the length of the room and press <Enter>:");
		length = sc.nextInt();
		System.out.println("Enter the width of the room and press <Enter>:");
		width = sc.nextInt();
		System.out.println("Enter the cost of the carpet per square metre and press <Enter>");
		cost = sc.nextDouble();
		
		//Using input to calculate output
		area = length * width;
		totalCost = area * cost;
		
		System.out.println("The cost to carpet the room is $" + totalCost + "0.");
		sc.close();
		

	}

}
