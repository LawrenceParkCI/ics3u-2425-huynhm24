package unit2;
import java.util.Scanner;

/**
 * Description: This program tells you if you are an adult
 * Date: November 9, 2024
 * @author Myra Huynh
 */

public class IfStatement2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your age?");
	    int userAge = in.nextInt();
	    
	    /*
	    if (userAge > 18) { //If they're over 18, they are titled an adult
	      String title = "Adult";
	    } else {  //if they're not over 18, I don't want a title
	      System.out.println("Sorry, not quite yet.");
	    }

	    System.out.println(title);
	    */
	    //Looking at the logic above, why do you think the 
	    //program won't work? 
	    //The program won't work because the variable adult is only named in the if output. If the else condition is met, the code in the if statement is ignored, so title is never named as a string variable. 
	    //In the last output statement, title is supposed to be printed but it can only be printed if the if condition is true. 

	    //Copy the code below, and try to find a solution.
	    //Comment the code above to avoid compilation errors.
	    
	    if (userAge > 18) { //If they're over 18, they are titled an adult
		      String title = "Adult";
		      System.out.println(title);
		    } else {  //if they're not over 18, I don't want a title
		      System.out.println("Sorry, not quite yet.");
		    }

		    
	    in.close();


	}

}
