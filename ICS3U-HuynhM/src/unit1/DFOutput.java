package unit1;
/**
 * Description: This program practices using decimal format by following the DFOutput worksheet. 
 * Date: October 17, 2024
 * @author Myra Huynh
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + money.format(total));
		

		//Change the above print statement on line 23 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//The first time I ran the program, the output printed many decimal places, but when I changed it, the output was the same number but with only 2 decimal places. 
		//This is because money.format is applied to the total. This changes the output into the format that was previously assigned to 'money'. 
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//The output now prints a $ sign in front of the total cost. 
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//The output now prints the same number as before, but this time with only one decimal place. 
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		//The total is being rounded to only 2 decimal places. 
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//Please enter the cost of an item then press <Enter>: $123456
		//The cost of your item with tax is $139505.28
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//This time, the output has a , every 3 number places.
		//The total is being put into a format that has 7 number places, with a , every 3 places from the decimal. It also has 2 decimal places. 
		//If the number is not large enough to fit into all the number places, they are not shown. 
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		//The value printed for the TAX_RATE is 0.13. 
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//This time, the tax rate is displayed as a percentage (still using the same value as before). 


		sc.close();
	}

}
