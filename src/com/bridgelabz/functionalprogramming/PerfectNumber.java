package com.bridgelabz.functionalprogramming;
/*
 * a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
 */
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		long number, sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scanner.nextLong();

		int i = 1;
		//this loop will execute until condition get false. 
		while (i <= number / 2) {			
			if (number % i == 0) {
				sum = sum + i;			// calculates the sum of factors
			}//end of if  
			
			//after each iteration, increments the value of variable i by 1  
			i++;
		}//end of while  
		
		//compare sum with the number
		if (sum == number) {
			System.out.println(number + " is a Perfect Number.");
		}
		else {

			System.out.println(number + " is not a perfect Number.");
		}

		scanner.close();
	}

}
