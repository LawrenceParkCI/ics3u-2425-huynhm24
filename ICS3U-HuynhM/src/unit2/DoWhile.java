package unit2;
/**
 * Description: This program finds if the user's name is Mr. Lee, and prints their word 20 times
 * Date: November 21, 2024
 * @author Myra Huynh
 */

import java.util.Scanner;

public class DoWhile {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
   		A loop is another control structure that allows for repetition. It 
   		does not make a decision on which branch to go on, like the 
   		conditional.
   		It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		

		//Run the code. Explain the code in your own words
		//The code asks the user their name and repeats the question until the name entered is "Mr. Lee". When Mr. Lee is entered it prints a specific output.  

		//What code is repeated?
		//Everything inside the curly braces of the do statement. It asks what the users name is. 
		
		//When does it decide whether to repeat or not?
		//After running through the code in the do curly braces, a while condition is used to determine if the code will repeat. 
		
		//What is the condition for repeating?
		//It repeats for any name inputed other than "Mr. Lee"


		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.
		
		String word;
		int times = 0;
		System.out.println("Type in a word:");
		word = in.nextLine();
		
		do {
			System.out.println(word);
			times ++;	
		} while (times < 20);
		
		in.close();
	}
}
