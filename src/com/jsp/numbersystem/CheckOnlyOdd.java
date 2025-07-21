package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckOnlyOdd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it contains only odd digits or not : ");
		int n = scn.nextInt();
		if(checkOnlyOdd(n)) {
			System.out.println("The number contains only odd");
		}
		else {
			System.out.println("The number does not contains only odd digits");
		}
		scn.close();
	}
	static boolean checkOnlyOdd(int n) {
		
		while(n>0) {
			int ld = n%10;
			if(ld%2==0) {
				return false;
			}
			n = n/10;
		}
		return true;
	}
}
