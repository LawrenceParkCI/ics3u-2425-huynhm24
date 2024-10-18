package unit1;
/**
 * Description: This program practices using number format by following the NFOutput worksheet. 
 * Date: October 17, 2024
 * @author Myra Huynh
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		//You cannot change how your value is displayed without changing the locale. 
		//What other formats does NumberFormat offer?
		NumberFormat.getIntegerInstance(); 
		//This format returns the value as a rounded integer. 
		NumberFormat.getCompactNumberInstance();
		//This format returns the value as a shorter data type. 


		sc.close();
	}

}
