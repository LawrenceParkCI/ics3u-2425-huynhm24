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
		Console c = new Console(35, 150, "Movieroom");

		//Declaring and initializing variables
		String menu;
		int menu2;
		String movieTitle;
		String choice;
		int watchlistCount = 0;
		int watchedCount = 0;
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
			c.setCursor(30, 75);

			c.setColor(new Color(96, 111, 184));
			c.fillRect(0, 0, width, height);

			c.setColor(Color.WHITE);
			c.setFont(new Font("SansSerif", Font.ITALIC, 35));
			c.drawString("You are in the movieroom! What would you like to do?", 170, 95);
			c.drawString("Type the index number of where you want to go!", 200, 150);

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

			menu = c.readLine();
			menu2 = Integer.parseInt(menu);
			
			Thread.sleep(600);
			c.clear();

			//Allowing user to add to the lists
			if (menu2 == 1) {
				c.setTextBackgroundColor(new Color(96, 111, 184));
				c.setTextColor(Color.WHITE);
				c.setCursor(14, 36);

				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.setColor(Color.BLACK);
				c.setFont(new Font("SansSerif", Font.BOLD, 45));
				c.drawString("Add or move movie", 364, 120);

				c.setColor(new Color(96, 111, 184));
				c.fillRect(264, 231, 650, 70);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 30));
				c.drawString("What is the title of the movie?", 369, 205);
				movieTitle = c.readLine();
				c.setColor(new Color(34, 58, 125));
				c.fillRect(914, 250, 400, 70);

				c.setColor(Color.WHITE);
				c.drawString("Type + to add it to watchlist OR rate it from 1 to 5", 220, 357);
				c.setColor(new Color(96, 111, 184));
				c.fillRect(264, 394, 650, 70);

				c.setCursor(22, 36);
				choice = c.readLine();
				c.setColor(new Color(34, 58, 125));
				c.fillRect(914, 394, 400, 50);

				Thread.sleep(500);

				if(choice.equals("+")) {
					watchlist[watchlistCount] = movieTitle;
					watchlistCount ++;
					c.setColor(Color.WHITE);
					c.drawString(movieTitle + " was added to watchlist", 400, 500);
				}

				else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {
					watched[watchedCount] = movieTitle;
					rated[watchedCount] = Integer.parseInt(choice);
					watchedCount ++;

					Thread.sleep(500);
					c.setColor(Color.WHITE);

					//Using method to compare and change watchlist
					if (compareString(movieTitle, watchlist, c) == true) {
						c.drawString(movieTitle + " was moved from watchlist to watched movies", 200, 500);
					}

					else {
						c.drawString(movieTitle + " was added to watched movies", 300, 500);
					}

				}

				else {
					c.clear();
					c.setColor(Color.WHITE);
					c.setFont(new Font("SansSerif", Font.BOLD, 40));
					c.drawString("There was a mistake", 400, 300);
				}
			}


			//Uses method to print watchlist
			else if (menu2 == 2) {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.setColor(Color.BLACK);
				c.setFont(new Font("SansSerif", Font.BOLD, 45));
				c.drawString("Watchlist", 470, 120);

				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.PLAIN, 30));
				c.drawString("Movie count: " + watchlistCount, 470, 200);

				Thread.sleep(300);
				
				printArray(watchlist, watchlist.length, "watchlist", c, width, height);

			}

			//Uses method to print watched movies
			else if (menu2 == 3) {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.setColor(Color.BLACK);
				c.setFont(new Font("SansSerif", Font.BOLD, 45));
				c.drawString("Watched Movies", 400, 120);

				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.PLAIN, 30));
				c.drawString("Movie count: " + watchedCount, 470, 200);

				Thread.sleep(300);

				printArray(watched, watched.length, "Movies you've watched", c, width, height);

				//if(watchedCount > 0) {
					int[] ratings = {5, 3, 4, 2, 1, 5, 1, 2, 3, 4, 2, 3, 4, 5, 1, 2, 3, 1, 5, 2, 1, 2, 4, 3, 3, 5};
					printArrayInt(ratings, ratings.length, c);
					//printArrayInt(rated, rated.length, c);
				//}


			}
				
			else {
				// still need to catch letters
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 65));
				c.drawString("Uh oh! You got lost! Type 0.", 250, 215);
			}

			Thread.sleep(500);

			c.setColor(Color.WHITE);
			c.setFont(new Font("SansSerif", Font.PLAIN, 25));
			c.drawString("Hit any key to return to the menu:", 390, 550);
			c.getChar();

		} while (menu2 != 4);

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
		for (int count2 = 0; count2 < 5; count2 ++) {
			c.setColor(new Color(255, 249, 189));

			int x = 190 + 170 * count2;
			c.fillStar(x, 205, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(x, 205, 120, 120);
		}

		Thread.sleep(500);

		for (int count3 = 0; count3 < 5; count3 ++) {
			c.setColor(Color.BLACK);

			int x = 870 - 170 * count3;
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
	 * @param array -> The array to print
	 * @param count -> The number of values of the array
	 * @param c -> The Console object for drawing text
	 * @param width -> Width of the console
	 * @param height -> Height of the console
	 */

	public static void printArray(String[] array, int count, String name, Console c, int width, int height) {
		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.ITALIC, 25));
		int ySpacing = 250;
		int xSpacing = 90;

		if (count == 0) {
			c.drawString("You have no movies in " + name, 250, 215);
		}

		else {
			for (int x = 0; x < count; x++) {
				if (array [x] != null) {
					c.drawString(array[x], xSpacing, ySpacing);
					ySpacing += 50;

					if (ySpacing == 500) {
						ySpacing = 250;
						xSpacing += 480;

					}

					if (xSpacing > 1050) {
						c.drawString("Hit any key to go to the next page", 390, 550);
						c.getChar();

						c.setColor(new Color(34, 58, 125));
						c.fillRect(80, 200, width, height);

						c.setColor(Color.WHITE);

						ySpacing = 250;
						xSpacing = 90;
					}
				}
			}
		}
	}


	/**
	 * This method will print all the non-null values of an array of ints
	 * @param array -> the array to print
	 * @param count -> the number of values of the array
	 * @param c -> The Console object for drawing text
	 */

	public static void printArrayInt(int[] array, int count, Console c) {

		int yPoint = 255;
		int xPoint = 90;
				
		for (int x = 0; x < count; x++) {
			if (array [x] != 0) {
				for (int counter = 0; counter < array[x]; counter ++) {
					
					if (yPoint > 455) {
						yPoint = 255;
						xPoint += 480;
					}
					
					if (xPoint > 1050) {
						yPoint = 255;
						xPoint = 90;
					}
					
					c.setColor(new Color(255, 249, 189));
					xPoint = 90 + 15 * counter;	
					c.fillStar(xPoint, yPoint, 12, 12);

				}
				
				yPoint += 50;
			}
		}
	}


	/**
	 * This method will compare a string to see if it already exists in an array and modify the value if it is the same
	 * @param array -> The array to compare to
	 * @param title -> The string to compare
	 * @param c -> The Console object for drawing text
	 * @return true if the string exists in the array, false if it does not
	 */

	public static boolean compareString(String title, String[] array, Console c) {
		for (int x = 0; x < array.length; x++) {
			if(array[x] != null && title.equalsIgnoreCase(array[x])) {
				array[x] = array[x] + "✓";
				return true;
			}
		}

		return false;

	}
}
