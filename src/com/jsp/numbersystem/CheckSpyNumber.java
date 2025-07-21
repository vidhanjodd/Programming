package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckSpyNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it is spy or not : ");
		int n = scn.nextInt();
		boolean isSpy = checkSpy(n);
		if(isSpy) {
			System.out.println("The number is spy");
		}
		else {
			System.out.println("The number is not spy");
		}
		scn.close();
	}
	static boolean checkSpy(int n) {
		int sum = 0;
		int product = 1;
		while(n>0) {
			int ld  = n%10;
			sum  = sum+ld;
			product = product*ld;
			n = n/10;
		}
		return product==sum?true:false;
	}
}
