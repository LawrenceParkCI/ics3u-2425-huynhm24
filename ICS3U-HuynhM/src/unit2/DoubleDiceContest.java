package unit2;

/**
 * Description: This program rolls two dice each for the user and computer, adding them together to decide who wins
 * Date: November 18, 2024
 * @author Myra Huynh
 */
public class DoubleDiceContest {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		
		//Stimulating user dice rolls
		int die1 = (int)(Math.random()*6) + 1;
		int die2 = (int)(Math.random()*6) + 1;
		int userTotal = die1 + die2;
		System.out.println("Your first roll is " + die1 + " and your second roll is " + die2 + "\nTotal: " + userTotal);
		
		//Stimulating computer dice rolls
		int die3 = (int)(Math.random()*6) + 1;
		int die4 = (int)(Math.random()*6) + 1;
		int computerTotal = die3 + die4;
		System.out.println("\nMy first roll is " + die3 + " and my second roll is " + die4 + "\nTotal: " + computerTotal);
		
		
		//Determining who won
		if (userTotal > computerTotal) {
			System.out.println("\nYou win!");
		}
		
		else if (userTotal == computerTotal) {
			System.out.println("\nTie!");
		}
		
		else {
			System.out.println("\nI win!");
		}

	}

}
