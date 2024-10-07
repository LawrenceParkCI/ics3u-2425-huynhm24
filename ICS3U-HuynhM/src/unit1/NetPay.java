package unit1;
/**
 * Description: This program contains part 1 of assignment 2, calculating net pay. 
 * Date: October 7, 2024
 * @author Myra Huynh
 */

public class NetPay {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		
		// Declaring variables
		int hours = 40;
		int wage = 5;
		int insurance = 2;
		double tax = 0.22;
		
		//Calculating net pay
		double netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		 
		System.out.println("The net pay of the employee is $" + netPay + ".");
		

	}

}
