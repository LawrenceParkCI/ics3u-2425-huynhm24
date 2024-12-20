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

		int [] arrayInt = {45, 2, 12, 3, 55};
		System.out.println(sum(arrayInt));
		System.out.println(min(arrayInt));
		System.out.println(max(arrayInt));
		System.out.println(bigDifference(arrayInt));

		double [] arrayDouble = {5.4, 46.4, 12.3, 0.7, 55.4};
		System.out.println(sum(arrayDouble));
		System.out.println(min(arrayDouble));
		System.out.println(max(arrayDouble));
		System.out.println(bigDifference(arrayDouble));

		int [] factors = factors(6);
		for (int i = factors.length - 1; i >= 0; i--) {
			System.out.print(factors[i] + " ");
		}
	}

	/**
	 *Description: This method finds the distance between two (x,y) coordinates
	 *@param x1 -> x value of the first coordinate
	 *@param y1 -> y value of the first coordinate
	 *@param x2 -> x value of the second coordinate
	 *@param y2 -> y value of the second coordinate
	 *@return the distance between two (x, y) coordinates 
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
	 * Description: This method calculates the sum of all ints in an array
	 * @param array -> an array of ints
	 * @return All of the ints of the array added together
	 */
	public static int sum(int[] array) {
		int total = 0;
		for (int i = array.length - 1; i >= 0; i-- ) {
			total += array[i];
		}
		return total;
	}

	/**
	 * Description: This method calculates the sum of all doubles in an array
	 * @param array -> an array of doubles
	 * @return All of the doubles of the array added together
	 */
	public static double sum(double[] array) {
		double total = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			total += array[i];
		}
		return total;
	}

	/**
	 * Description: This method finds the index of the smallest number of an array of ints
	 * @param array -> an array of ints
	 * @return The index of the lowest number of the array
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
	 * Description: This method finds the index of the smallest number of an array of doubles
	 * @param array -> an array of doubles
	 * @return The index of the lowest number of the array
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
	 * Description: This method finds the index of the highest number of an array of ints
	 * @param array -> an array of ints
	 * @return The index of the highest number in the array
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
	 * Description: This method finds the index of the highest number in an array of doubles
	 * @param array -> an array of doubles
	 * @return The index of the highest number in the array
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
	 * Description: This method finds the difference between the highest and lowest number in an array of ints
	 * @param array -> an array of ints
	 * @return The difference between the highest and lowest number of the array
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

	/**
	 * Description: This method calculates the difference between the highest and lowest numbers in an array of doubles
	 * @param array -> an array of doubles
	 * @return The difference between the highest and lowest numbers of the array
	 */
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
	 * Description: This method saves all the factors of a number into an array
	 * @param num -> any integer
	 * @return An array containing the factors of the given number
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

		return factors;

	}
}
