package com.bridgelabz.functionalprogramming;
/*
 * Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime number.
 */
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		PrimeNumber primenumber = new PrimeNumber();
		if (primenumber.isPrime(number)) {				//calling method
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
		scanner.close();

	}
		//create method to check enter number is prime number or not
	public boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number / 2; i++) {
			//condition for nonprime number
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
