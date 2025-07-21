package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckStrong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it is strong or not : ");
		int n = scn.nextInt();
		boolean isStrong = checkStrong(n);
		if(isStrong) {
			System.out.println("The number is strong....");
		}
		else {
			System.out.println("The number is not strong....");
		}
		scn.close();
	}
	static boolean checkStrong(int n) {
		int dup = n;
		int sum = 0;
		while(n>0) {
			int ld = n%10;
			int fac = 1;
			for(int i=1;i<=ld;i++) {
				fac = fac*i;
			}
			sum += fac;
			n =n/10;
		}
		if(dup == sum) {
			return true;
		}
		return false;
	}
}
