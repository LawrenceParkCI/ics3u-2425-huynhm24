package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date: November 23, 2024
 * @author Myra Huynh 
 */
public class LoopChallenge2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
		 * Write a program to take the square root of a number typed in by 
	      the user. Your program should use a loop to ensure that the number 
	      they typed in is positive. If the number is negative, you should 
	      print out some sort of warning and make them type it in again.
	      
	      You can get the square root of a number n with Math.sqrt(n). Make 
	      sure you don't do this until the loop is done and you know for 
	      sure you've got a positive number.
	      
	      Use the loop that you didn't use in LoopChallenge1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Type in a number:");
		num = sc.nextInt();	
		
		do {
			System.out.println("Don't use a negative number!");
			System.out.println("Type in another number:");
			num = sc.nextInt();
		} while (num < 0);
		
		System.out.println("The square root of your number is " + Math.sqrt(num));

	}

}
