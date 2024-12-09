package unit2;

import java.util.Scanner;

/**
 * Description: This program allows the user to continue if their name is Ms. Kemp. 
 * Date: November 25, 2024
 * @author Myra Huynh
 */
public class FlowChartChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {

		 /*Create a flow chart for this program. Add the Share link
	    to your flowchart as a comment in this program.
	    How would the flow chart of the do-while loop
	     and while loop differ?
	    */
		//Link: https://drive.google.com/file/d/1ImppxQm3LoNj4isFzFng3PJISiMI3x7f/view?usp=sharing
		//The flow chart of a while loop would have the condition for repetition above the code that repeats, but a do-while flow chart has the code before the condition.
	    
	    Scanner in = new Scanner(System.in);
	    String name;
	    do {
	      System.out.print("What is your name? ");
	      name = in.nextLine();
	    } while (!name.equals("Ms. Kemp"));

	    System.out.println("You are welcome into the secret secret pogchamp club.");

	    in.close();
	}

}
