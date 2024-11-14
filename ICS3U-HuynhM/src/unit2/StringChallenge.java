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
		System.out.println("Do you prefer oranges or lemons?");
		String fruit = sc.next();
		
		//Printing output based on user input
		if (fruit.equals("lemons")) {
			System.out.println("Ohhh sour!");
		}
		
		//I am comparing their answer to see if it is the same as "lemons", so I can decide what to print. I have to use .equals() because my variable is a string. 
		else if(fruit.equalsIgnoreCase("ORANGES")) {
			System.out.println("A refreshing summer treat!");
		}
		
		//I am comparing their answer to see if it is the same as "ORANGES", but it does not matter what case the letters are in. This will run as long as the letters oranges are typed. 
		else {
			System.out.println("Ewwwwww!");
		}
		
		//Calculating how many fruits they can pay for			
		System.out.println("How many dollars do you have today?");
		int dollars = sc.nextInt();
		double decimalForm = dollars;
		//I implicitly casted the dollars variable from an int to a double. Before the value would have had no decimal places, but now it does. 
		
		double cost = 3.25; 
		double num = decimalForm / cost;
		
		int quantity = (int) num;
		//Here I explicitly casted the num variable so that it was an int instead of a double. 
		//This way, when I calculate how many fruits the user can buy it will be to the last whole number, not a decimal. 
		
		System.out.println("This is how many " + fruit + " you can buy today: " + quantity);
		
		sc.close();
		
		
		
	}
}