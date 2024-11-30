package unit2;

/**
 * Description: This program tests different uses of if-else statements 
 * Date: November 5, 2024
 * @author Myra Huynh
 */

public class IfStatements1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		int firstNum = 10;
	    int secondNum = 30;

	    System.out.println("Part 1: If");
	    System.out.println("----------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGLUL");
	    }    

	    //What prints out? Why?
	    
	    // Nothing is printed because the if statement is false and there is no code for a false statement
	    

	    System.out.println("\nPart 2: If, Else");
	    System.out.println("----------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //XQCL prints out because the if statement is false, so the code under the else statement is used

	    System.out.println("\nPart 3: If, Else if, Else");
	    System.out.println("-------------------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //sykSHY is printed because the of the three scenarios, the else if statement is true. The else condition cannot be printed because the code above it is read first and it is skipped over. 

	    System.out.println("\nPart 4: What's the difference?");
	    System.out.println("------------------------------");
	    System.out.println(1);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    System.out.println(2);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    }

	    if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    }

	    if (!(firstNum < secondNum)) {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    /*
	     * 1
	     * KEKW
	     * OMEGALUL
	     * 2
	     * KEKW
	     * OMEGALUL
	     * sykSHY
	     * is printed because the first if statement is true as well as the second and third. 
	     */
	    //What is the difference between the first and second part?
	    //In the first part, the conditions are listed in if-else statements so only one of them can be true. In the second part, many if statements are used without else statements so multiple of them can be true and nothing will happen if they're false. 

	}

}
