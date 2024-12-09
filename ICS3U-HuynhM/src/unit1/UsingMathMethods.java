package unit1;

import java.util.Scanner;

/**
 * Description: This program follows the instructions of Using Math Methods assignment. 
 * Date: October 9, 2024
 * @author Myra Huynh
 */
public class UsingMathMethods {

 /**
  * This is the entry point to the program
  * @param args
  */
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double num;
  
  System.out.println("Part A");
  
  //Write code to ask the user for any real number to be input.
  //Store their input into the num variable
  
  System.out.println("Please enter any real number and press <Enter>");
  num = sc.nextDouble();
  
  System.out.println(Math.round(num));
  System.out.println(Math.rint(num));
  System.out.println(Math.sqrt(num));
  System.out.println(Math.abs(num));
  System.out.println(Math.pow(num, 2));
  System.out.println(Math.pow(num, num));
  System.out.println(Math.pow(num, 3));
  
  /*
   * Run the program and write down the output that is produced
   * when each of the following values are input:
   * 
   *      num = 16.75  | num = 4.0  | num = -23.45
   *      -----------------------------------------------
   * Math.round(num)   17                  | 4     | -23
   * Math.rint(num)    17.0                | 4.0   | -23.0
   * Math.sqrt(num)    4.092676385936225   | 2.0   | naN
   * Math.abs(num)     16.75               | 4.0   | 23.45
   * Math.pow(num, 2)  280.5625            | 16.0  | 549.9024999999999
   * Math.pow(num, num)3.178689376746782E20| 256.0 | NaN
   * Math.pow(num, 3)  4699.421875         | 64.0  | -12895.213624999999   
   * 
   */
  
  //Why does the last value(-23.45) give strange output for Math.sqrt(num)?
  //Nan stands for Not a number!
  //Negative numbers become imaginary numbers when they are square rooted. This cannot be displayed in whole number form, so it is displayed as Not a number. 
  
  //In your own words describe what the following Math methods does
  /*
   * round: This rounds a number to the nearest whole (in int form). 
   * rint: This rounds a number to the nearest whole number, which is displayed as a floating point. 
   * sqrt: This square roots a number and displays it as a double.  
   * abs: This finds the absolute value of a number (the number in positive form no matter it's sign).
   * pow: This assigns the first number listed as the base and the second number listed as the exponent, then calculates this (displayed in double form). 
   */
  
  //The methods round, sqrt and abs only have one parameter (which is in the brackets)
  //Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
  // The pow method has two parameters, because the calculation involves two numbers. The first parameter is the base of the exponent, and the second parameter is the power. Without knowing both of these, you cannot calculate powers. 
  
  
  System.out.println("Part B");
  //Ask the user for any real number and an integer to be input. Display the real number,
  //and its square root. Also determine and display the real number raised to the integer power.
  //Use suitable headings, displaying the results across the screen.\
  //
  //Eg. If the real number 13.5 and the integer 2 are input, display
  //REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
  //   13.5     3.6742   182.25
  
  double num2;
  double integer;
  
  System.out.println("Please enter any real number and press <Enter>");
  num2 = sc.nextDouble();
  System.out.println("Please enter any integer and press <Enter>");
  integer = sc.nextDouble();
  
  System.out.printf("\n%-20s%-20s%-20s", "REAL NUMBER", "SQUARE ROOT", "RAISED TO POWER " + integer);
  
  System.out.printf("\n%-20s%-20s%-20s", num2, Math.sqrt(num2), Math.pow(num2, integer));
 
  //Write down the results produced by your program when the real number 7.8985 and
  //the integer 3 are input.
  
  /*
   * number = 7.8985 integer = 3
   * num2 = 7.8985
   * Math.sqrt(num2) = 2.8104270138183627
   * Math.pow(num2, integer) = 492.75820832162503 
   */
 
  
  
  //Change your program so that instead of inputting an integer power, a real number
  //power can be input.
  //Write down the results produced by your program when the following are input:
  //a) the number 16 and the real number power 0.5
  /*
   * REAL NUMBER         SQUARE ROOT         RAISED TO POWER 0.5 
     16.0                4.0                 4.0   
   */
  //b) the number 8 and the real number power 0.33
  
  /*
   * REAL NUMBER         SQUARE ROOT         RAISED TO POWER 0.33
     8.0                 2.8284271247461903  1.9861849908740719  
   */
  
  //Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
  // Yes, the raised to power part has a higher decimal. 
  
  sc.close();
  
  
 }

}
