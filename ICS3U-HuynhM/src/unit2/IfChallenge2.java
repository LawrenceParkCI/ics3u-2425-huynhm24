package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: November 12, 2024
 * @author Myra Huynh
 */

public class IfChallenge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//This is for the portfolio

		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */
		
		double num1, num2, num3;
		System.out.println("Please enter 3 numbers and press <Enter> between each one:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		if (num1 < num2 && num2 < num3) {
			System.out.println("Your numbers are strictly in order!");
		}

		sc.close();
	}
}