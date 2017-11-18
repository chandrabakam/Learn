package com.csinc.java;

import java.util.Scanner;

//Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; 
//because of this, the last newline character for that line of integer input is still queued in the input buffer 
//and the next nextLine() will be reading the remainder of the integer line (which is empty).
//Sample Input
//42
//3.1415
//Welcome to HackerRank's Java tutorials!
//Sample Output
//String: Welcome to HackerRank's Java tutorials!
//Double: 3.1415
//Int: 42

public class Solution2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
      

       
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}



