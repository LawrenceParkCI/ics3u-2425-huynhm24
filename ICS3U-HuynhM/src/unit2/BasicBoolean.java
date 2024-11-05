package unit2;

/**
 * Description: This program shows the uses of different symbols
 * Date: November 5, 2024
 * @author Myra Huynh
 */
public class BasicBoolean {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		//we've declared a variable called isPurple of boolean type
	    //Recall: boolean holds either true or false
	    boolean isPurple = false;


	    /*
	      Boolean Operators, Expressions
	    */

	    //boolean expressions are ways we can "calculate" whether
	    //something is true or false

	    int firstNum = 5;
	    int secondNum = 10;
	    double thirdNum = 5.5;

	    //this prints out true because first num is less than second num
	    System.out.println("1: " + (firstNum < secondNum)); 

	    //this prints out false because first num is not greater than second num
	    System.out.println("2: " + (firstNum > secondNum)); 

	    //this prints out true because first num is equal to third num when it is casted as an int
	    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
	    //this prints out true because first num is less than third num
	    System.out.println("4: " + (firstNum <= thirdNum)); 

	    /*Test out these boolean operators. Figure out the meaning
	      * > means: Greater than
	      * < means: less than
	      * <= means: less than or equal to
	      * >= means: greater than or equal to
	      * == means: is equal to
	      * != means: is not equal to 
	    */

	}

}
