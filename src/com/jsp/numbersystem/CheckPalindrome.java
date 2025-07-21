package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check if it is Palindrome or not : ");
		int n = scn.nextInt();
		if(checkPalindrome(n)) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}
		scn.close();
	}
	static boolean checkPalindrome(int n) {
		int rev = 0;
		int dup = n;
		while(n>0) {
			int ld = n%10;
			rev = rev*10+ld;
			n = n/10;
		}
		if(rev == dup) {
			return true;
		}
		return false;
	}
}
