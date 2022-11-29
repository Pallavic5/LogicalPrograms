package com.bridgelabz.functionalprogramming;
/*
 * Write a Stopwatch Program for measuring the time that elapses between
   the start and end clicks
 */
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		/*
		 * Initialized two long variables to calculate the starting and ending times. 
		 * By subtracting them and dividing them by 1000.0 we can calculate the time in seconds.
		 * currentTimeMillis method is used to calculate the current time.
		 */
		Scanner scanner = new Scanner(System.in);
		long start, end;
		double time;
		System.out.println("Type any character to start the stopwatch");
		char startArray = scanner.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println("Type any character to stop the stopwatch");
		char stopArray = scanner.next().charAt(0);
		end = System.currentTimeMillis();
		time = (end - start) / 1000.0;
		System.out.println(time);
		scanner.close();

	}

}
