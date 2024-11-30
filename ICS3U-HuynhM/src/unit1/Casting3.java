package unit1;

/**
* Description: This follows the casting 3 worksheet, 
* Date: October 15, 2024
* @author Myra Huynh
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //The "1 + 2 + 3" part is a string, and since it is read first, the rest of the code in the brackets is cast as a string. 

    //Demonstrate casting a double value to a String in this way
    System.out.println("45.5" + 55.56);
    
    //Demonstrate casting a boolean value to a String in this way
    System.out.println("This is " + true);
    
    //Demonstrate casting a char value to a String in this way
    char myChar = 't';
    System.out.println("34" + myChar);

    System.out.println("\nPart 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" - error
     * "23c"  - error
     * "2 3"  - error
     * "Lol23"- error
     * "-5"   - works, outputs: -5 x 2 = -10
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //Integer.parseInt() can be used to cast a string as an int, but only so long as the string value was already in integer form.  

    // What do you think the code to change a String to double would look like?
    String strNum2 = "25.2";
    double myDouble = Double.parseDouble(strNum2);
    System.out.println(strNum2 + " x 2 = " + (myDouble + myDouble));
    
    //Similarly, test out the code and write down what instructions
    /*Change strNum to the following values, and see if they work:
     * "25.2" - works, outputs 25.2 x 2 = 50.4
     * "23c"  - error
     * "2 3"  - error
     * "Lol23"- error
     * "-5"   - works, outputs: -5 x 2 = -10.0
    */
    //What can you say about how we can use the function, Double.parseDouble()?
    //Dounle.parseDouble() can be used to cast a string as a double, but only so long as the string value was already a real number. 


    //When do you think it might be necessary to change a string value into an integer value/double value?
    //This could be helpful when the value of the string variable is predicted to be a string OR an int. For excample, when processing user input, we may not know what they will write.  
  }
}