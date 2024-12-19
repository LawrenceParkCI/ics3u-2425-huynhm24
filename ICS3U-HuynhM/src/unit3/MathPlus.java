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
		int [] min = {45, 2, 12, 3, 55};
		System.out.println(min(min));
		int [] max = {22, 3, 4, 66, 74};
		System.out.println(max(max));


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

	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static int sum(int[] array) {
		int total = 0;
		for (int i = array.length; i > 0; i-- ) {
			total += array[i];
		}
		return total;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static double sum(double[] array) {
		double total = 0;
		for (int i = array.length; i > 0; i--) {
			total += array[i];
		}
		return total;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static int min(int[] array) {
		int min = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		return min;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static double min(double[] array) {
		int min = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		return min;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static int max(int[] array) {
		int max = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		return max;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static double max(double[] array) {
		int max = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		return max;
	}
	
	/**
	 * Description: 
	 * @param
	 * @return
	 */
	public static int bigDifference(int[] array) {
		int max = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		
		int min = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		
		int diff = array[max] - array[min];
		return diff;
	}
	
	public static double bigDifference(double[] array) {
		int max = 0;
		
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		
		int min = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		
		double diff = array[max] - array[min];
		return diff;
	}
	
	/**
	 * Description:
	 * @param
	 * @return
	 */
	public static int[] factors(int num) {
		int [] factors = new int[numOfFactors(num)];
		int index = 0;
		
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				factors[index] = i; 
				index ++;
			}
		}
		
		return factors[];
		
	}
}
