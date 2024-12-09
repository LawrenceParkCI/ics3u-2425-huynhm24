package unit2;

import java.util.Scanner;
/**
 * Description: This program counts the number of occurrences of each A, C, G, and T nucleotide within a DNA sequence
 * Date: December 1, 2024
 * @author Myra Huynh
 */

public class DNAStringChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		 /*
	      http://rosalind.info/problems/dna/
	    */
		Scanner sc = new Scanner(System.in);
		
		//User input for the DNA
		System.out.println("Input the DNA sequence:");
		String s = sc.next();
		
		//Creating counters for each letter 
		int countA = 0;
		int countC = 0;
		int countG = 0;
		int countT = 0;
		
		//Using a for loop to count each symbol
		for (int index = 0; index < s.length(); index ++) {
			
			if (s.charAt(index) == ('A')){
				countA ++;
			}
			else if (s.charAt(index) == ('C')) {
				countC ++;
			}
			else if (s.charAt(index) == ('G')) {
				countG ++;
			}
			else if (s.charAt(index) == ('T')) {
				countT ++;
			}
		}
		
		//Printing the results
		System.out.println(countA + " " + countC + " " + countG + " " + countT);
		
		sc.close();
		

	}

}
