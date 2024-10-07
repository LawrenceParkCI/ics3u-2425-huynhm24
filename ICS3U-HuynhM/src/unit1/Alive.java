package unit1;
import java.util.Scanner;
/**
 * Description: This program contains part 2 of assignment 2, calculating time spent sleeping. 
 * Date: October 7, 2024
 * @author Myra Huynh
 */
public class Alive {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring variables
		int year1, year2, month1, month2, day1, day2;
		
		//Gathering user input for birthday date
		System.out.println("Enter your birthdate:");
		System.out.println("Year:");
		year1 = sc.nextInt();
		System.out.println("Month (in number form):");
		month1 = sc.nextInt();
		System.out.println("Day:");
		day1 = sc.nextInt();
		
		//Gathering user input for today's date
		System.out.println("\nEnter today's date:");
		System.out.println("Year:");
		year2 = sc.nextInt();
		System.out.println("Month:");
		month2 = sc.nextInt();
		System.out.println("Day:");
		day2 = sc.nextInt();
		
		//Using user input to calculate their days alive and time slept
		int daysAlive = (12 * (year2 - year1 - 1)) + ((12 - month1) + (12 - month2));
		
		
		
		sc.close();
		
		
	}

}
