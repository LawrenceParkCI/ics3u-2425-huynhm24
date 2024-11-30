package unit2;

import java.util.Scanner;

/**
 * Description: This program tells the user if they like their name 
 * Date:November 19, 2024
 * @author Myra Huynh
 */
public class NameGame {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Gathering user input
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		
		//Generating a random number and printing output based on it
		int fav = (int)(Math.random()*10);
		
		if (fav < 3) {
			System.out.println("I hate that name.");
		}
		
		else {
			System.out.println(name + " is my favourite name!");
		}
		 sc.close();
	}

}
