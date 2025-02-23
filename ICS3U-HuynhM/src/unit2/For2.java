package unit2;

/**
 * Description: This program tests the function of for loops
 * Date: November 27, 2024
 * @author Myra Huynh
 */

public class For2 {
	/**
	 * This is the entry point of the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:
		
		for (int count = 1; count <= 10; count ++) {
			System.out.println(count);
		}


	    //though we are repeating a certain number of times, we can use variables in our for loops as well

	    int times = 20;

	    for (int i = 15; i < times; i++) {
	      System.out.println(i);
	    }

	    //In addition, the counter doesn't necessarily have to be an integer
	    double increment = 0.1;
	    for (double i = 0; i < 2; i += increment) {
	      System.out.println(i);
	    }

	    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
	    
	    for (double startNum = 5; startNum < 9; startNum += 0.4) {
	    	System.out.println(startNum);
	    }

	    

	   //Look at the following code. Explain what is happening?

	    int sum = 0; 

	    for (int i = 1; i < 10; i++) {
	      sum += i;
	    }

	    System.out.println(sum);
	    
	    // The sum variable is only printed outside of the for loop (after it is finished)
	    //The value that is printed is that value that has been through the for loop 9 times already
	    //Inside the loop, the sum (starting at 0) is being added to the int (starting at 1) which increases by 1 each loop

	}

}
