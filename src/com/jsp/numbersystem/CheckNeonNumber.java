package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckNeonNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it is neon or not : ");
		int n = scn.nextInt();
		boolean isNeon = checkNeon(n);
		if(isNeon) {
			System.out.println("The number is neon....");
		}
		else {
			System.out.println("The number is not neon....");
		}
		scn.close();
	}
	static boolean checkNeon(int n) {
		int sq = n*n;
		int sum = 0;
		while(sq>0) {
			int ld = sq%10;
			sum += ld;
			sq = sq/10;
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
}
