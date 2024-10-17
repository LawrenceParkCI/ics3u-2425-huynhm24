package unit1;
/**
 * Description: This program follows the Working with Strings worksheet.
 * Date: October 4, 2024
 * @author Myra Huynh
 */

public class PlayingWithStrings {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//2. a
		String fruit = "apple";
		fruit = "banana";
		System.out.println(fruit + " split");
		
		//2. b
		String num1 = "12";
		String num2 = "34";
		System.out.println(num1 + num2);
		
		//2. c
		System.out.println(num1 + num2 + 56);
		
		//2. d
		String number1 = 13  + "";
		System.out.println(number1);
		
		//2. e 
		fruit = "apple";
		System.out.println(fruit.length());
		
		//2. f
		String name = "Runnymede";
		System.out.println(name.length() + "Ravens".length());
		
		//3. a
		String message = "Themouseranuptheclock";
		String word = message.substring(3,8);
		System.out.println(word);
		
		//3. b
		message = "JackandJillwentupthehill";
		System.out.println(message.substring(20));
		
		//3. c
		System.out.println(message.substring(message.length() - 4));
		
		//3. d
		System.out.println("hello".substring(3));
		
		//3. e
		System.out.println("hello".substring(5));
		
		//3. f
		//System.out.println("hello".substring(6));
		
		//3. g
		String spaces = "     Trim me     ";
		String noSpaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(noSpaces);
		
		//3. h
		String digits = "1234567890";
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));
		
		//3. i
		System.out.println("Ilovesandwiches".substring(5).length());
		
		//3. j
		String word1 = "hello";
		String word2 = word1;
		word1 = word1.substring(1,2);
		System.out.println(word2);
		
		//3. k
		String name1 = "Pierre Elliot Trudeau";
		String name2 = name1.substring(0, 6) + name1.substring(15);
		System.out.println(name2);
		
		//4.
		String msg = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " + letter);
		System.out.println("msg has " + msg.length() + " characters.");
		
				
		
		
		
		
		
		

	}

}
