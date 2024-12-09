package unit2;

import java.util.Scanner;

/**
 * Description: This program lets the user in if they answer the right password
 * Date: November 23, 2024
 * @author Myra Huynh
 */

public class LoopChallenge1 {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
	      Create a program that will ask for the password.  If they answer 
	      incorrectly, tell them, and repeat. If they answer correctly, 
	      welcome them in.
	      
	      Extra: if they don't give a proper answer within 3 
	      Decide on whether you should use the while or do while loop.
	    */
		
		Scanner sc = new Scanner(System.in);
		String password;
		
		System.out.println("What is the password?");
		password = sc.nextLine(); 
		
		while (!password.equals("crumb")) {
			System.out.println("Incorrect! Try again: ");
			password = sc.nextLine();
		}
		
		System.out.println("Welcome!");
		
		sc.close();
		
		

	}

}
