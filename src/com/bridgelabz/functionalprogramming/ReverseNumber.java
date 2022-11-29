package com.bridgelabz.functionalprogramming;
/*
 * We can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number, reversedNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a original number: ");
		number = scanner.nextInt();
		while (number != 0) {
			// last digit get from number.
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			// remove last digit from number
			number = number / 10;
		}
		System.out.println("Reversed number: " + reversedNumber);
		scanner.close();
	}

}
