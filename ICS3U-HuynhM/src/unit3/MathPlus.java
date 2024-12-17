package unit3;
/**
 * Description: This program has multiple math methods that complete calculations
 * Date: December 17, 2024
 * @author Myra Huynh
 */

public class MathPlus {

	public static void main(String[] args) {
		System.out.println(distance(5, 7, 9, 9));
		System.out.println(hypotenuse(15, 30));
		System.out.println(numOfFactors(64));
		System.out.println(isPrime(73));
		

	}
	
/**
 Description: This method finds the distance between two (x,y) coordinates
 @param x1 -> x value of the first coordinate
 @param y1 -> y value of the first coordinate
 @param x2 -> x value of the second coordinate
 @param y2 -> y value of the second coordinate
 @return the distance between two (x, y) coordinates 
 */
	public static double distance( int x1, int y1, int x2, int y2 ){
		double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return length;
	}
	
/**
 * Description: This method finds the hypotenuse of two lengths
 * @param a -> the length of one side
 * @param b -> the length of another side
 * @return The distance between the two lengths when they make a square root. 
 */
	public static double hypotenuse(double a, double b) {
		double hyp = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hyp;
	}
	
/**
 * Description: This method returns the number of factors of a given number
 * @param product -> Any integer number
 * @return the number of factors of the variable product
 */
	public static int numOfFactors(int product) {
		int factors = 0;
		for(int i = product; i > 0; i--) {
			if(product % i == 0) {
				factors ++;
			}
		}
		return factors;
	}
	
/**
 * Description: This method returns true or false depending on whether a given number is prime
 * @param product -> Any integer number
 * @return True if prime, false if not
 */
	public static boolean isPrime(int product) {
		boolean prime = (numOfFactors(product) <= 2);
		return prime;
	}
}
