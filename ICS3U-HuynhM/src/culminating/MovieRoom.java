package culminating;
import java.util.Scanner;

/**
 * Description: This program organizes movies for the user into watchlist and watched, as well as rate movies. 
 * Date: January 8, 2025
 * @author Myra Huynh
 */

public class MovieRoom {
	/**
	 * This is the entry point to the program
	 * @param args unused 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring and initializing variables
		int menu;
		String movieTitle;
		String choice;
		String [] watchlist = new String[100]; 
		int i = 0;
		
		System.out.println("Movieroom");
		System.out.println("Welcome! What would you like to do today? Type the index number of where you want to go!");
		System.out.println("1. Add movie");
		System.out.println("2. Watchlist");
		System.out.println("3. Watched");
		System.out.println("4. Leave");
		menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.println("Add movie");
			System.out.println("What is the title of the movie?");
			movieTitle = sc.nextLine();
			System.out.println("Type + to add it to watchlist OR rate it from 1 to 5");
			choice = sc.nextLine();
			
			if(choice.equals("+")) {
				watchlist[i] = movieTitle;
				i++;
			}
			
			
		}
		
		sc.close();
	}

}
