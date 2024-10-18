package unit1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Description: This program provides costs and a receipt for a user's grocery shopping list. 
 * Date: October 18, 2024
 * @author Myra Huynh
 */

public class GroceryShopping {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("|| $$$ \\\\\\ ========== \"Ms. Huynh's Grocery\" ========== /// $$$ ||");
		
		//Creating variables
		String item1, item2;
		Double cost1, cost2;
		int quantity1, quantity2;
		
		//Gathering user input on their items
		System.out.println("\nWelcome!");
		System.out.print("What would you like to buy? ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost? $");
		cost1 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		quantity1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Thank you!");
		
		System.out.println("\nNext item:");
		System.out.print("What would you like to buy? ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost? ");
		cost2 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		quantity2 = sc.nextInt();
		System.out.println("Thank you!");
		
		//Calculating total prices
		double totalPrice1 = cost1 * quantity1;
		
		//Printing their receipt
		System.out.println("\nThis is your receipt!");
		System.out.println("\nMs. Huynh's Grocery");
		
		//Finding the date and time of printing
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		System.out.println(time);
		
		//Printing the item information based on user input
		System.out.printf("\n%-15s|%-15s|%-15s|%-15s", "Item", "Price", "Quant.", "Total Price");
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf("\n%-15s|%-5s%10s|%-15s|%-5s%10s", item1, "$", cost1 + " ", quantity1, "$", totalPrice1 + " ");
		
		
		
		
		
		
		
		
		
		

	}

}
