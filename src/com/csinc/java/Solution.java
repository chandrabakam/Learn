package com.csinc.java;

import java.util.Scanner;

//Task In this challenge, you must read  integers from stdin and then print them to stdout. 
//Each integer must be printed on a new line. 
//Input Format
//There are  lines of input, and each line contains a single integer.
//Sample Input
//42
//100
//125
//Sample Output
//42
//100
//125

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int myInt1 = scan.nextInt();
		int myInt2 = scan.nextInt();
		int myInt3 = scan.nextInt();
		//String myString = scan.next();
		//System.out.println("My String"+myString);
		System.out.println(myInt1);
		System.out.println(myInt2);
		System.out.println(myInt3);
		
		
	}

}
