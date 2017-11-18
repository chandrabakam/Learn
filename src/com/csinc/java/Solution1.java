package com.csinc.java;

import java.util.Scanner;

//Task 
//Given an integer, , perform the following conditional actions:
//If n is odd, print Weird
//If n is even and in the inclusive range of 6 to 10, print Weird
//If n is even and in the inclusive range of  2 to 5 , print Not Weird
//If n is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//Input Format
//A single line containing a positive integer, .
//Constraints
//1<=n<=100
//Output Format
//Print Weird if the number is weird; otherwise, print Not Weird.

public class Solution1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ans;
		
		if (n % 2 == 1)
			ans = "Weird";
		else {
			if (n >= 2 && n <= 5)
				ans = "Not Weird";
			else if (n >= 5 && n <= 20)
				ans = "Weird";
			else
				ans = "Not Weird";
		}
		System.out.println(ans);
		// System.out.println((n%2==1 || (n>=6 && n<=20)) ? "Weird" : "Not
		// Weird");
	}
}
