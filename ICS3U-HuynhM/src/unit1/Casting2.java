package unit1;

/**
* Description: This program follows the Casting 2 worksheet, where I cast chars and ints. 
* Date: October 15, 2024
* @author Myra Huynh
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    //In the code, the value 'a' is assigned to the variable, myChar (a char type). When 1 is added, it is printed as 98, which is an int. This is implicit casting. 
    //When it is cast as a char before 1 is added, it is printed as 'b'. This is explicit casting from int to char. 
    //This happens because when 1 is added to myChar, it is converted to an integer, this integer is the number value of 'a'.
    //When myChar cast as a char before being added with 1, it is converted back to a char type, 'b', the letter value of the ASCII number 98. 
    
    //Why do you think this happens?
    //This happens because 'a' and 1 are different types and cannot be added, so one of them must be changed. 'a' has an ASCII number value, so it can be converted to an int.
    //The ASCII number 1 has a character value, but it would not be b. If you add two characters together, they just print next to each other. 
    
    //Investigate what is ASCII. What is it?
    //ASCII (American Standard Code for Information Interchange) is a format that assigns all characters a numerical value, this includes letters and punctuation. 
    
    //Can you find the number value for 'a'? Does it match with your findings above?
    //The ASCII number value for 'a' is 97. This matches with my findings above because 97 + 1 is 98. 

    //Create a new character myCharCap, and transform myChar into a capital 'A' and print it
    
    char myCharCap = (char) (myChar - 32);
    System.out.println(myCharCap);
    
    //I can do this because the uppercase version of the lowercase letter is always 32 less in ASCII values. 

  }
}