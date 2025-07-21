package com.jsp.numbersystem;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it is happy or not : ");
		int n = scn.nextInt();
		if(isHappy(n)) {
			System.out.println("The number is happy....");
		}
		else { 
			System.out.println("The number is not happy....");
		}
		scn.close();
	}
	static boolean isHappy(int n) {
		while(n>9) {
			int sum = 0;
//			int temp = n;
			while(n>0) {
				int ld = n%10;
				sum = sum+ld*ld;
				n = n/10;
			}
			n=sum;	
		}
        return n == 1 || n == 7;
    }
}