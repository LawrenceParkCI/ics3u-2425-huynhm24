package unit2;

import java.util.Scanner;

/**
 * Description: 
 * Date: November 12, 2024
 * @author Myra Huynh
 */

public class StringChallenge {
	
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    	Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    	Also, include an example of explicit and implicit casting.

    	Comment to explain:
      	-when you use the different String functions
      	-when you are casting and how the value is changed
		*/
		Scanner sc = new Scanner(System.in);
		
		//Asking the user for input
		System.out.println("Do you prefer watermelon or lemon?");
		String fruit = sc.next();
		
		//Printing output based on user input
		if (fruit.equals("lemons")) {
			System.out.println("Ohhh sour!");
		}
		
		else if(fruit.equalsIgnoreCase("WATERMELON")) {
			System.out.println("A refreshing summer treat!");
		}
		
		else {
			System.out.println("Ewwwwww!");
		}
		
		//Finding how much they can pay for
		System.out.println("How much money do you have today?");
		double money = sc.nextInt();
		double cost = 3.45; 
		
		sc.close();
		
		
		
	}
}