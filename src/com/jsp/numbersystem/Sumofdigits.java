package com.jsp.numbersystem;


import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scn.nextInt();
		int sum = sum(n);
		System.out.println("The sum of all digit is : "+sum);
		scn.close();
	}
	static int sum(int n) {
		int sum=0;
		while(n>0) {
			int ld = n%10;
			sum = sum+ld;	
			n = n/10;
		}
		return sum;
	}
}
