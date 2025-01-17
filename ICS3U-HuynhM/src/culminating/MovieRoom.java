package culminating;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import hsa_new.Console;

/**
 * Description: This program organizes movies for the user into watchlist and watched categories, as well as rate movies they watched. 
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

		//User input variables
		int menu;
		String movieTitle;
		String choice;
		
		//Counter variables
		int watchlistCount = 0;
		int watchedCount = 0;
		
		//Set variables
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
			//Prints menu of action options for the user
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
			c.drawString("1. Enter movie", 250, 300);
			c.drawString("2. Watchlist", 708, 300 );
			c.drawString("3. Watched", 278, 450);
			c.drawString("4. Leave", 728, 450);
			menu = c.readInt();

			Thread.sleep(600);
			c.clear();

			//Asking the user for a movie title
			if (menu == 1) {
				c.setTextBackgroundColor(new Color(96, 111, 184));
				c.setTextColor(Color.WHITE);
				c.setCursor(14, 36);

				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(new Color(224, 232, 255));
				c.fillRect(264, 50, 650, 100);

				c.setColor(Color.BLACK);
				c.setFont(new Font("SansSerif", Font.BOLD, 45));
				c.drawString("Enter Movie", 450, 120);

				c.setColor(new Color(96, 111, 184));
				c.fillRect(264, 231, 650, 70);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 30));
				c.drawString("What is the title of the movie?", 369, 205);
				movieTitle = c.readLine();
				c.setColor(new Color(34, 58, 125));
				c.fillRect(914, 250, 400, 70);
				
				//Rejecting a title longer than 24 characters
				if (movieTitle.length() > 24) {
				    c.setColor(new Color(34, 58, 125));
				    c.fillRect(0, 0, width, height);
				    c.setColor(Color.WHITE);
				    c.setFont(new Font("SansSerif", Font.BOLD, 40));
				    c.drawString("Title is too long! Max: 24 Characters", 200, 300);
				}
				
				//Saving a title less than 24 characters to watchlist or watched, depending on user input 
				else {
					c.setColor(Color.WHITE);
					c.drawString("Type + to add it to watchlist OR rate it from 1 to 5", 220, 357);
					c.setColor(new Color(96, 111, 184));
					c.fillRect(264, 394, 650, 70);

					c.setCursor(22, 36);
					choice = c.readLine();
					c.setColor(new Color(34, 58, 125));
					c.fillRect(914, 394, 400, 50);

					Thread.sleep(500);

					//Adding movie to watchlist
					if(choice.equals("+")) {
						watchlist[watchlistCount] = movieTitle;
						watchlistCount ++;
						c.setColor(Color.WHITE);
						c.drawString(movieTitle + " was added to watchlist", 400, 500);
					}
					
					//Adding movie to watched
					else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {
						watched[watchedCount] = movieTitle;
						rated[watchedCount] = Integer.parseInt(choice);
						watchedCount ++;

						Thread.sleep(500);
						c.setColor(Color.WHITE);

						//Using method to compare and change watchlist if needed
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
				
			}


			//Uses method to print watchlist
			else if (menu == 2) {
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
				
				//Method is only called if there is a value in the array
				if (watchlistCount > 0) {
					printArray(watchlist, c, width, height);
				}
				
				else {
					c.drawString("You have no movies in watchlist", 340, 300);
				}

			}

			//Uses method to print watched movies
			else if (menu == 3) {
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
				
				//Method is only called if there is a value in the array
				if(watchedCount > 0) {
					printMoviesWithRatings(watched, rated, c, width, height);
				}
				
				else {
					c.drawString("You have no watched movies", 360, 300);
				}


			}
			
			//Leaving screen
			else if (menu == 4) {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 45));
				c.drawString("Thank you for using MovieRoom! Goodbye!", 100, 300);
				Thread.sleep(1000); 
			}
			
			//Redirecting from a wrong input
			else {
				c.setColor(new Color(34, 58, 125));
				c.fillRect(0, 0, width, height);
				c.setColor(Color.WHITE);
				c.setFont(new Font("SansSerif", Font.ITALIC, 65));
				c.drawString("Uh oh! You got lost!", 250, 215);
			}
			
			//Providing a way back to the menu screen
			if (menu != 4) {
				Thread.sleep(500);
			    c.setColor(Color.WHITE);
			    c.setFont(new Font("SansSerif", Font.PLAIN, 25));
			    c.drawString("Hit any key to return to the menu:", 390, 550);
			    c.getChar();
			}

		} while (menu != 4);

		//Exit graphics
		c.setColor(Color.BLACK);
		c.fillRect(0, 0, width, height);

		c.setColor(new Color(96, 111, 184));
		c.fillRect(190, 350, 800, 200);

		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 100));
		c.drawString("~ The End ~", 267, 475);
		Thread.sleep(450);

		//Printing 5 stars
		for (int count2 = 0; count2 < 5; count2 ++) {
			c.setColor(new Color(255, 249, 189));

			int x = 190 + 170 * count2;
			c.fillStar(x, 205, 120, 120);

			c.setColor(new Color(255, 240, 91));
			c.drawStar(x, 205, 120, 120);
		}

		Thread.sleep(500);
		
		//Removing the stars one by one
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
	 * @param c -> The Console object for drawing text
	 * @param width -> Width of the console
	 * @param height -> Height of the console
	 */

	public static void printArray(String[] array, Console c, int width, int height) {
		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.ITALIC, 25));
		
		//Initial x and y coordinates
		int ySpacing = 250;
		int xSpacing = 90;
		
		int count = array.length;

		//Prints all non-null values 
		for (int x = 0; x < count; x++) {
			if (array [x] != null) {
				c.drawString(array[x], xSpacing, ySpacing);
				ySpacing += 50;

				//Spacing out a new column once 5 rows have printed
				if (ySpacing == 500) {
					ySpacing = 250;
					xSpacing += 400;
				}
				
				//Clearing the old values then displaying the next page once 3 columns have printed
				if (xSpacing > 1050) {
					c.drawString("Hit any key to go to the next page", 390, 550);
					c.getChar();

					c.setColor(new Color(34, 58, 125));
					c.fillRect(80, 200, width, height);

					c.setColor(Color.WHITE);
					
					//Resetting the x and y coordinates
					ySpacing = 250;
					xSpacing = 90;
				}
			}
		}

	}
	
	/**
	 * This method will print all the non-null values of an array of strings (titles) 
	 * and their corresponding ratings (stars) from an integer array, arranged in rows and columns.
	 * @param watched -> The array of movie titles
	 * @param ratings -> The array of ratings (stars to print)
	 * @param c -> The Console object for drawing text
	 * @param width -> Width of the console
	 * @param height -> Height of the console
	 */
	
	public static void printMoviesWithRatings(String[] watched, int[] ratings, Console c, int width, int height) {
		c.setFont(new Font("SansSerif", Font.ITALIC, 25));
		
		//Initial x and y coordinates
	    int yPoint = 255;   
	    int xPoint = 90; 
	    
	    //Variable used to space out columns
	    int spacing = 0; 
	    
	    //Prints all non-null titles and ratings
	    for (int x = 0; x < watched.length; x++) {
	        if (watched[x] != null) {
	            
	            c.setColor(Color.WHITE);  
	            c.drawString(watched[x], xPoint, yPoint - 5);  

	            int rating = ratings[x];
	            
	            //Prints number of stars according to rating value
	            for (int i = 0; i < rating; i++) {
	                c.setColor(new Color(255, 249, 189));  
	                int starX = xPoint + 15 * i; 
	                int starY = yPoint;
	                c.fillStar(starX, starY, 12, 12);  
	            }

	            yPoint += 50;

	            //Marks when 5 rows are filled 
	            if (yPoint > 455) {
	                spacing++;
	                yPoint = 255;  
	            }

	            //Spaces a new column
	            if (spacing > 0) {
	                xPoint = 90 + 400 * spacing;
	            }
	            
	            //Clearing the old values then displaying the next page once 3 columns have printed
	            if (xPoint > 890) {
	                c.drawString("Hit any key to go to the next page", 390, 550);
	                c.getChar();
	             
	                c.setColor(new Color(34, 58, 125));  
	                c.fillRect(80, 200, width, height); 

	                c.setColor(Color.WHITE);  
	                
	                //Resetting the variables 
	                yPoint = 255;  
	                xPoint = 90;
	                spacing = 0;
	            }
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
		
		//Compares each value of both arrays
		for (int x = 0; x < array.length; x++) {
			if(array[x] != null && title.equalsIgnoreCase(array[x])) {
				
				//Reassigning value in the watchlist
				array[x] = array[x] + "✓";
				return true;
			}
		}

		return false;

	}
}