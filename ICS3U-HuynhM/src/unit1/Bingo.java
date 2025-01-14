package unit1;
/**
 * Description: This program describes the rules of Bingo, and provides an example of a Bingo card.
 * Date: September 25, 2024
 * @author Myra Huynh
 */


public class Bingo {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// These statements explain the rules of Bingo
		System.out.println("How to Play Bingo!");
		System.out.println("1. The caller randomly pulls a numbered bingo ball.");
		System.out.println("2. The number is placed on the bingo board and called out.");
		System.out.println("3. Players look for the called number on their bingo card.");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println("5. Steps 1 to 4 are repeated until a player matches a BINGO pattern.");
		System.out.println("6. The winning player yells \"Bingo!\"");
		System.out.println("-----------------------------------");
		// These statements create an example of a BINGO card
		System.out.println("\nBINGO Card:");
		System.out.println(" ______________________");
		System.out.printf("|%-5s%-6s%-5s%-5s%-1s|", "B", "I", "N", "G", "O");
		System.out.println("\n|----------------------|");
		System.out.printf("|%-5s%-5s%-5s%-5s%-1s|", "12", "17", "31", "48", "74");
		System.out.printf("\n|%-5s%-5s%-5s%-5s%-1s|", "4", "22", "42", "57", "66");
		System.out.printf("\n|%-5s%-4s%-6s%-5s%-1s|", "9", "19", "FREE", "49", "73");
		System.out.printf("\n|%-5s%-5s%-5s%-5s%-1s|", "10", "29", "32", "46", "70");
		System.out.printf("\n|%-5s%-5s%-5s%-5s%-1s|", "5", "16", "45", "60", "68");
		System.out.println("\n|______________________|");
	

	}

}
