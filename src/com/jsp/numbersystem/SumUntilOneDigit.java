package com.jsp.numbersystem;

import java.util.Scanner;

public class SumUntilOneDigit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		int n = scn.nextInt();
		int res = sumUntilOne(n);
		System.out.println("The remaining num is : "+res);
		scn.close();
	}
	static int sumUntilOne(int n) {
		if(n<0) {
			n = -n;
		}
		while(n>9) {
			int sum=0;
			int dup = n;
			while(dup>0) {
				sum = sum+dup%10;
				dup = dup/10;
			}
			n = sum;
		}
		return n;
	}
}
