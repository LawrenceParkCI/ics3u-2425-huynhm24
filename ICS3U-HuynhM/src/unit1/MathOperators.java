package unit1;
/**
 * Description: This program follows the instructions of the Math Operators worksheet
 * Date: October 1, 2024
 * @author Myra Huynh
 */

public class MathOperators {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		 /*
        Pre: Kind of Math, but not really
        What do you notice is happening?
     */
     //The numbers in the quotations are printing separately to the math operations
		
     System.out.println("Butter" + "fly");
     
     System.out.println("1 + 2 + 3 + 4 + 5");
     
     System.out.println(1 + 2 + 3 + 4 + 5);
     
     System.out.println(1 + 2 + "3 + 4 + 5");
     
     System.out.println("1 + 2 + 3" + 4 + 5);
     
     
     //Why do you think the last two outputs act so differently?
     /*The quotations separate the math operations from the text. 
      *This prints the text in the quotations along with the result of the other operations. 
      */
     
     //Summary: What are two possible roles of the + operator?
     /*
      *The + operator can connect string and operations when a line is printed
      *It can also complete math operations with numbers, representing addition
      */
     
    
     
     /*
        Part 1 
        Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.
     */
        
     // + means: 
     System.out.println("\nStrawberry" + "jam" + 7 + 15);
     System.out.println(7 + 15);
     // The + operator can connect string statements and do math addition operations
     
     // - means:
     System.out.println(92-30);
     // The - operator can do math subtraction operations
     
     // * means:
     System.out.println(6*7);
     // The * operator can do math multiplication operations
     
     // / means: 
     System.out.println(222-45-71);
     // The / operator can do math division operations and can be used to make comments
     
     
     
     //Print the following expression: (3 + 2) * 5
     System.out.println((3 + 2) * 5);
     //Print the following expression: 3 + 2 * 5
     System.out.println(3 + 2 * 5);
     //Was this expected? Why or why not?
     // This was expected because the system follows the rules of BEDMAS, so brackets change the order of operations
     
     /*
        Part 2 - Calculate Using Operators
        Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
        
        Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
     */     
     
     /*
        Part 3
        Figure out what is the meaning of % as a math operator. Use print statements
        to check your answer.
     */
     
     //I think % means: 

	}

}
