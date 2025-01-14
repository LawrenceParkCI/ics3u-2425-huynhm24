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
		int i = 0;

		//Declaring and initializing arrays
		String [] watchlist = new String[100]; 
		String [] watched = new String[100];
		int [] rated = new int[100];

		do {
			//Prints menu of action option for the user
			System.out.println("Movieroom");
			System.out.println("Welcome! What would you like to do today? Type the index number of where you want to go!");
			System.out.println("1. Add movie");
			System.out.println("2. Watchlist");
			System.out.println("3. Watched");
			System.out.println("4. Leave");
			menu = sc.nextInt();
			sc.nextLine();

			//Allowing user to add to the lists
			if (menu == 1) {
				System.out.println("Add or move movie");
				System.out.println("What is the title of the movie?");
				movieTitle = sc.nextLine();
				System.out.println("Type + to add it to watchlist OR rate it from 1 to 5");
				choice = sc.next();

				if(choice.equals("+")) {
					watchlist[i] = movieTitle;
					i++;
				}

				else {
					watched[i] = movieTitle;
					rated[i] = Integer.parseInt(choice);
					i++;
					
					//Using method to compare and change watchlist
					if (compareString(movieTitle, watchlist) == true) {
						System.out.println(movieTitle + " was moved from watchlist to watched movies");
					}

					else {
						System.out.println(movieTitle + " was added to watched movies");
					}
				}
			}

			//Uses method to print watchlist
			else if (menu == 2) {
				System.out.println("Movie count: " + watchlist.length);
				printArray(watchlist, watchlist.length, "Watchlist");
			}

			//Uses method to print watched movies
			else if (menu == 3) {
				System.out.println("Movie count: " + watched.length);
				printArray(watched, watched.length, "Movies you've watched");
				printArrayInt(rated, rated.length, "Ratings");
				//number of stars 
				//if int = 3 -> print 3 stars 
			}

			else {
				System.out.println("Uh oh! You got lost! Type 0.");
			}

		} while (menu != 4);

		sc.close();
	}

	/**
	 * This method will print all the non-null values of an array of strings
	 * @param array -> the array to print
	 * @param count -> the number of values of the array
	 * @param name -> the name of the list being printed 
	 */
	public static void printArray(String[] array, int count, String name) {
		System.out.println(name);
		if (count == 0) {
			System.out.println("No items in " + name + ".");
		}

		else {
			for (int x = 0; x < count; x++) {
				if (array [x] != null) {
					System.out.println(array[x]);
				}
			}
		}
	}

	/**
	 * This method will print all the non-null values of an array of ints
	 * @param array -> the array to print
	 * @param count -> the number of values of the array
	 * @param name -> the name of the list being printed 
	 */
	public static void printArrayInt(int[] array, int count, String name) {
		System.out.println(name);

		for (int x = 0; x < count; x++) {
			if (array [x] != 0) {
				System.out.println(array[x]);
			}
		}
	}

	/**
	 * This method will compare a string to see if it already exists in an array and modify the value if it is the same
	 * @param array -> The array to compare to
	 * @param title -> The string to compare
	 * @return true if the string exists in the array, false if it does not
	 */
	public static boolean compareString(String title, String[] array) {
		for (int x = 0; x < array.length; x++) {
			if(array[x] != null && title.equalsIgnoreCase(array[x])) {
				array[x] = array[x] + "✓";
				return true;
			}
		}

		return false;

	}
}
