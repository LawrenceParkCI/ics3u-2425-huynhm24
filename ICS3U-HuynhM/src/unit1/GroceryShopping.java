package unit1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

/**
 * Description: This program provides total costs and a receipt for a user's 2-item grocery shopping list. 
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

		//Formatting
		DecimalFormat money = new DecimalFormat("$#,###,###.00");
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter timeF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Title
		System.out.println("|| $$$ \\\\\\ ========== \"Myra's Grocery\" ========== /// $$$ ||");
		
		//These are my variables for user input
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
		System.out.print("How much does it cost? $");
		cost2 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		quantity2 = sc.nextInt();
		System.out.println("Thank you!");
		
		//These are my variables for cost calculations
		final double TAX_RATE = 0.13;
		double totalPrice1 = cost1 * quantity1;
		double totalPrice2 = cost2 * quantity2;
		double subtotal = totalPrice1 + totalPrice2; 
		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;
		
		//Printing their receipt
		System.out.println("\nThis is your receipt!");
		System.out.println("\n ______________________________________________________________");
		System.out.printf("|%-62s|", " ");
		System.out.println("\n|-------------------------Myra's Grocery-----------------------|");
		
		System.out.printf("|%-62s|", timeF.format(date));
		System.out.printf("\n|%-62s|", " ");
		
		//Printing the item information based on user input
		System.out.printf("\n|%-15s|%-15s|%-15s|%-14s|", "Item", "Price", "Quant.", "Total Price");
		System.out.println("\n|--------------------------------------------------------------|");
		System.out.printf("|%-15s|%-5s%10s|%15s|%-5s%9s|", item1, " $", money.format(cost1) + " ", quantity1 + " ", " $", money.format(totalPrice1) + " ");
		System.out.printf("\n|%-15s|%-5s%10s|%15s|%-5s%9s|", item2, " $", money.format(cost2) + " ", quantity2+ " ", " $", money.format(totalPrice2) + " ");
		System.out.printf("\n|%-62s|", " ");
		System.out.printf("\n|%32s%15s:%-5s%9s|", " ", "Subtotal", " $", money.format(subtotal) + " ");
		System.out.printf("\n|%32s%15s:%-5s%9s|", " ", "Tax", " $", money.format(tax) + " ");
		System.out.printf("\n|%32s%15s:%-5s%9s|", " ", "Total", " $", money.format(total) + " ");
		System.out.println("\n|______________________________________________________________|");
		
		//Rounding to the nearest dollar and 5 cents
		System.out.println("\n\nThis is approximately $" + Math.round(total) + " to the nearest dollar.");
		double fiveCents = total - (total % 0.05);
		System.out.println("This is approximately " + money.format(fiveCents) + " to the nearest 5 cents.");
		
		//Concluding the program
		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Myra's Grocery!");
		
		
		
		
		
		
		
		
		
		

	}

}
