package unit2;
import java.util.Scanner;

/**
 * Description: This program practices using while loops by asking the user for a number of people and asking what their names are, then printing a word 20 times. 
 * Date: November 21, 2024
 * @author Myra Huynh
 */



public class While {
	/**
	 * This is the entry point to the program. 
	 * @param args unused
	 */
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("How many people are you planning to see?");

   //Why do you think I coded it this way?
   
   int numPeople = Integer.parseInt(in.nextLine());

   while (numPeople > 0) {
     System.out.print("What is this person's name? ");

     //Why do you think the variable is declared here?
     //The variable is only needed to be used within the while statement, which may or may not run based on the user input. This variable is only used if the statement runs. 
     String name = in.nextLine();
     System.out.println("Welcome, " + name + "!");

     numPeople = numPeople - 1;
   }
   
   //Run the code Using the debugger. 
   //Explain the code in your own words
   //The code asks how many people there are and asks for a name once for each person. 

   //What code is repeated?
   //The part where it asks the person's name
   
   //When does it decide whether to repeat or not?
   //At the start of the while statement 
   
   //What is the condition for repeating?
   //The code will repeat as long as the variable numPeople is greater than 0

   //What is the difference between a while loop and a do-while loop?
   //In a do-while loop, the code is run first and then it decides whether or not to repeat, but in a while loop, the decision to run the code is made before the code is run. 

   //Create a while loop that asks for a word, 
   //and prints it out 20 times.
   
   System.out.println("\nWrite a word:");
   String word = in.nextLine();
   int times = 19;
   
   while (times >= 0) {
	   System.out.println(word);
	   times --;
   }
   
   in.close();
 }
}