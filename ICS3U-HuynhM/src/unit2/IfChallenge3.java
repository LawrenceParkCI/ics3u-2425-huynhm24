package unit2;
import java.util.Scanner;

/**
 * Description: This program is a quiz that asks you three questions about movies.
 * Date: November 13, 2024
 * @author Myra Huynh
 */

public class IfChallenge3 {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Introduction
		System.out.println("|---------------/|-|MOVIES QUIZ|-|\\----------------|");
		
		System.out.println("\nWelcome! I will ask you 3 questions, let's see how you do!");
		
		//Declaring my variables
		int score = 0;
		String answer1, answer3;
		int answer2;
		
		//Asking question 1
		System.out.println("\nQuestion 1:");
		System.out.println("Who played Dorothy in the Wizard of Oz?");
		System.out.println("\n1. Peggy Lee");
		System.out.println("2. Marilyn Monroe");
		System.out.println("3. Daisy Buchanan");
		System.out.println("4. Judy Garland\n");
		answer1 = sc.nextLine();
		
		//Printing output based on answer
		if (answer1.equalsIgnoreCase("Judy Garland") || answer1.equalsIgnoreCase("4")) {
			System.out.println("Yay! You are correct.");
			score ++;
		}
	
		else {
			System.out.println("Awww. Sorry, you are incorrect.");
		}
		
		//Asking question 2
		System.out.println("Let's move on!");
		System.out.println("\nQuestion 2:");
		System.out.println("What year was the movie Titanic released?");
		System.out.println("\n1. 1999");
		System.out.println("2. 1997");
		System.out.println("3. 1980");
		System.out.println("4. 1986\n");
		answer2 = sc.nextInt();
		
		//Printing output based on answer
		if (answer2 == 1997 || answer2 == 2) {
			System.out.println("Congrats! You are right.");
			score ++;
		}
		
		else {
			System.out.println("Oh no! That is not correct.");
		}
		sc.nextLine();
		
		//Asking question 3
		System.out.println("Alright, last one.");
		System.out.println("\nQuestion 3:");
		System.out.println("What is the name of the main character in Home Alone?");
		System.out.println("\n1. Macaulay Culkin");
		System.out.println("2. Evan Peterson");
		System.out.println("3. James Forester");
		System.out.println("4. Kevin McCallister\n");
		answer3 = sc.nextLine();
		
		//Printing output based on the answer
		
		if (answer3.equalsIgnoreCase("Kevin McCallister") || answer3.equals("4")) {
			System.out.println("Good job! You are correct!");
			score ++;
		}
		
		else {
			System.out.println("Sorry, that is incorrect.");
		}
		
		//Printing total score
		System.out.println("You got " + score + " out of 3.");
		
		if (score >= 2) {
			System.out.println("Great job!");
		}
			
		else {
			System.out.println("That's too bad...");
		}
		
		sc.close();
	}

}
