package culminating;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import hsa_new.Console;

/**
 * Description: This program organizes movies for the user into watchlist and watched, as well as rate movies. 
 * Date: January 8, 2025
 * @author Myra Huynh
 */

public class MovieRoom {

	/**
	 * This is the entry point to the program
	 * @param args unused 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Console c = new Console(40, 150, "Movieroom");

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
			//Mainscreen graphics
			c.setColor(Color.BLACK);
			c.fillRect(0, 0, 2000, 2000);

			c.setColor(new Color(96, 111, 184));
			c.fillRect(190, 370, 800, 200);

			c.setColor(Color.WHITE);
			c.setFont(new Font("SansSerif", Font.BOLD, 100));
			c.drawString("movieroom", 320, 495);

			//Printing 5 stars one by one
			c.setColor(new Color(255, 249, 189));
			c.fillStar(190, 225, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(190, 225, 120, 120);

			Thread.sleep(250);

			c.setColor(new Color(255, 249, 189));
			c.fillStar(360, 225, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(360, 225, 120, 120);

			Thread.sleep(250);

			c.setColor(new Color(255, 249, 189));
			c.fillStar(530, 225, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(530, 225, 120, 120);

			Thread.sleep(250);

			c.setColor(new Color(255, 249, 189));
			c.fillStar(700, 225, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(700, 225, 120, 120);

			Thread.sleep(250);

			c.setColor(new Color(255, 249, 189));
			c.fillStar(870, 225, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(870, 225, 120, 120);
			
			Thread.sleep(250);
			c.clear();
			//Prints menu of action option for the user
			c.setColor(new Color(96, 111, 184));
			c.fillRect(0, 0, 2000, 2000);
			
			c.setColor(Color.WHITE);
			c.setFont(new Font("SansSerif", Font.BOLD, 50));
			c.drawString("Welcome to movieroom! What would you like to do today? Type the index number of where you want to go!", 320, 495);
			
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
		c.close();
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
