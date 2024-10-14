package unit1;

import java.util.Scanner;

/**
* Description: This program follows the instructions of Casting assignment.
* Date: October 10, 2024
* @author Myra Huynh
*/
public class Casting {
 
 /**
  * This is the entry point to the program.
  * @param args unused
  */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
    //A double type is printed. This is because the value of intNum, despite starting as an int, was assigned to doubleNum, which is a double type. 

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
    //The value of doubleNum is changed into it's value plus 2.2. It will be printed as a double. 

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);
    //An int type is being printed here because the value of doubleNum has been assigned to intNum.
    //Since doubleNum is a double type, and intNum is an int type, doubleNum has to be cast as an int. 

    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double: implicit 
      doubleNum = intNum;
      
      double to int: explicit
      intNum = (int) doubleNum;
      
      int to long: implicit
      long longNum;
      longNum = intNum;
      
      long to int: Explicit 
      intNum = (int) longNum;

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    
    Implicit casting can happen because the original value is smaller than the one it is being changed to.
    Explicit casting needs to happen when the original value is larger than the one it is being changed to. 
    Since it's full amount of data cannot fit in the new data type, it needs to be cast into a smaller type without loosing any data. 
     
    */

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    //code
    myNum = in.nextDouble();
    myNum = (int) (myNum * 10)/10.0;
    System.out.print("Rounding down to the nearest tenth, it is: " + myNum);
    
    in.close();
    
  }
}