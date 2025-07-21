// write a program to count digits present in the number 
package com.jsp.numbersystem;
import java.util.*;
public class CountDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		long n = scn.nextInt();
		int count = count(n);
		System.out.println("The number of digit is : "+count);
		scn.close();
	}
	static int count(long n) {
		int count = 0;
		while(n>0) {
			count++;
			n = n/10;
		}
		return count;
	}
}
