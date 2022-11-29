package com.bridgelabz.functionalprogramming;

/*
 * Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
 */

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstTerm = 0, secondTerm = 1;

		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter a number: ");
		int number = scanner.nextInt(); // take user input
		System.out.println("Fibonacci Series till " + number + " terms: ");

		for (int i = 1; i <= number; ++i) {		//loop starts from 1 because 0 are already printed
			System.out.println(firstTerm);
			int nextTerm = firstTerm + secondTerm; // add firstterm and secondterm
			firstTerm = secondTerm; // apply swapping concept
			secondTerm = nextTerm; // apply swapping concept
		}

		scanner.close();
	}
}
