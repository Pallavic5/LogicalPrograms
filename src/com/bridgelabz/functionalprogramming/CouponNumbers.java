package com.bridgelabz.functionalprogramming;
/*
 * Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
 */
public class CouponNumbers {

	// return a random coupon between 0 and n-1
	public static int getCoupon(int number) {

		return (int) (Math.random() * number);
	}

	// return number of cards you collect before obtaining one of each of the n types
	public static int collect(int number) {
		boolean[] isCollected = new boolean[number]; // isCollected[i] = true if card type i already collected
		int count = 0; // number of cards collected
		int distinct = 0; // number of distinct card types collected

		// repeat until you've collected all n card types
		while (distinct < number) {

			int value = getCoupon(number); // pick a random card
			count++; // one more card
			if (!isCollected[value]) { // discovered a new card type
				distinct++;
				isCollected[value] = true;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int count = collect(n);
		System.out.println(count);
	}
}
