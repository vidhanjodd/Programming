package com.jsp.numbersystem;
import java.util.*;
public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scn.nextInt();
		int revNum = reverse(n);
		System.out.println("The reversed number is : "+revNum);
	}
	static int reverse(int n) {
		int rev = 0;
		while(n>0) {
			int ld = n%10;
			rev = rev*10+ld;
			n = n/10;
		}
		return rev;
	}
}
