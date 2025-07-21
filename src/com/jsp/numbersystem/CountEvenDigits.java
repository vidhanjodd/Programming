package com.jsp.numbersystem;

import java.util.Scanner;

public class CountEvenDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scn.nextInt();
		int count = countEven(n);
		System.out.println("The number of digit is : "+count);
		scn.close();
	}
	static int countEven(int n) {
		int count = 0;
		while(n>0) {
			int ld = n%10;
			if(ld%2==0) {
				count++;
			}
			n = n/10;
		}
		return count;
	}
}
//wap to define a method to count how many even digits are present in the given number ;