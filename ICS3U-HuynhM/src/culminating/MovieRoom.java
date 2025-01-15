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
		int height = c.getHeight();
		int width = c.getWidth();

		//Declaring and initializing arrays
		String [] watchlist = new String[100]; 
		String [] watched = new String[100];
		int [] rated = new int[100];

		//Cover graphics
		c.setColor(Color.BLACK);
		c.fillRect(0, 0, width, height);

		c.setColor(new Color(96, 111, 184));
		c.fillRect(190, 350, 800, 200);

		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 100));
		c.drawString("movieroom", 315, 475);
		Thread.sleep(450);

		//Printing 5 stars one by one
		
		for (int count = 0; count < 5; count ++) {
			c.setColor(new Color(255, 249, 189));
			
			int x = 190 + 170 * count;
			c.fillStar(x, 205, 120, 120);
			
			c.setColor(new Color(255, 240, 91));
			c.drawStar(x, 205, 120, 120);
			
			Thread.sleep(250);
		}

		Thread.sleep(600);
		c.clear();

		do {
			//Prints menu of action option for the user
			c.setTextBackgroundColor(new Color(96, 111, 184));
			c.setTextColor(Color.WHITE);
			c.setCursor(35, 75);

			c.setColor(new Color(96, 111, 184));
			c.fillRect(0, 0, width, height);

			c.setColor(Color.WHITE);
			c.setFont(new Font("SansSerif", Font.ITALIC, 35));
			c.drawString("You are in the movieroom! What would you like to do?", 138, 95);
			c.drawString("Type the index number of where you want to go!", 164, 150);

			c.setColor(new Color(224, 232, 255));
			c.fillRect(193, 250, 350, 75);
			c.fillRect(193, 400, 350, 75);
			c.fillRect(633, 250, 350, 75);
			c.fillRect(633, 400, 350, 75);

			c.setColor(Color.BLACK);
			c.setFont(new Font("SansSerif", Font.PLAIN, 35));
			c.drawString("1. Add movie", 258, 300);
			c.drawString("2. Watchlist", 708, 300 );
			c.drawString("3. Watched", 278, 450);
			c.drawString("4. Leave", 728, 450);

			menu = c.readInt();

			//Allowing user to add to the lists
			if (menu == 1) {
				c.setTextBackgroundColor(new Color(96, 111, 184));
				c.setTextColor(Color.WHITE);
				c.setCursor(16, 36);

				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);
				c.setColor(new Color(96, 111, 184));
				c.fillRect(264, 227, 650, 70);

				c.setColor(Color.BLACK);
				c.setFont(new Font("SansSerif", Font.BOLD, 45));;
				c.drawString("Add or move movie", 364, 120);

				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 30));
				c.drawString("What is the title of the movie?", 369, 205);
				movieTitle = c.readLine();
				c.setColor(new Color(34, 58, 125));
				c.fillRect(914, 227, 400, 50);

				c.setColor(Color.WHITE);
				c.drawString("Type + to add it to watchlist OR rate it from 1 to 5", 220, 357);
				c.setColor(new Color(96, 111, 184));
				c.fillRect(264, 394, 650, 70);

				c.setCursor(26, 36);
				choice = c.readLine();
				c.setColor(new Color(34, 58, 125));
				c.fillRect(914, 394, 400, 50);

				Thread.sleep(500);

				//Why is this part not running? Problem with input?
				if(choice.equals("+")) {
					watchlist[i] = movieTitle;
					i++;
					c.setColor(Color.WHITE);
					c.drawString(movieTitle + " was added to watchlist", 300, 500);

				}

				else {
					watched[i] = movieTitle;
					rated[i] = Integer.parseInt(choice);
					i++;

					//Using method to compare and change watchlist
					if (compareString(movieTitle, watchlist) == true) {
						c.drawString(movieTitle + " was moved from watchlist to watched movies", 200, 500);
					}

					else {
						c.drawString(movieTitle + " was added to watched movies", 300, 500);
					}
				}
			}

			//Uses method to print watchlist
			else if (menu == 2) {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.drawString("Movie count: " + watchlist.length, 364, 120);
				if (watchlist.length > 0) {
				//How do you print a method hsa console?
				printArray(watchlist, watchlist.length, "Watchlist");
				}
				
				else {
					c.drawString("You have no movies in your watchlist", 250, 215);
				}
			}

			//Uses method to print watched movies
			else if (menu == 3) {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.drawString("Movie count: " + watched.length, 364, 120);
				
				if (watched.length > 0) {
					printArray(watched, watched.length, "Movies you've watched");
					printArrayInt(rated, rated.length, "Ratings");
					//number of stars loop
					//if int = 3 -> print 3 stars
				}
				
				else {
					c.drawString("You have no watched movies yet", 250, 215);
				}
				 
			}

			else {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 65));
				c.drawString("Uh oh! You got lost! Type 0.", 250, 215);
			}

		} while (menu < 4);
		
		//Exit graphics
		c.setColor(Color.BLACK);
		c.fillRect(0, 0, width, height);

		c.setColor(new Color(96, 111, 184));
		c.fillRect(190, 350, 800, 200);

		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 100));
		c.drawString("~ The End ~", 267, 475);
		Thread.sleep(450);

		//Removing the stars one by one
		for (int count = 0; count < 5; count ++) {
			c.setColor(new Color(255, 249, 189));
			
			int x = 190 + 170 * count;
			c.fillStar(x, 205, 120, 120);
			
			c.setColor(new Color(255, 240, 91));
			c.drawStar(x, 205, 120, 120);
		}
		
		Thread.sleep(500);
		
		for (int count = 0; count < 5; count ++) {
			c.setColor(Color.BLACK);
			
			int x = 870 - 170 * count;
			c.fillStar(x, 205, 120, 120);
			
			c.setColor(Color.BLACK);
			c.drawStar(x, 205, 120, 120);
			
			Thread.sleep(250);
		}

		Thread.sleep(600);
		c.clear();
		
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
