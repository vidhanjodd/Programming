package com.jsp.numbersystem;
import java.util.*;
public class SumOfPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scn.nextInt();
		int sum = sumPrime(n);
		System.out.println("The sum of all prime digit present in the number is : "+sum);
		scn.close();
	}
	static int sumPrime(int n) {
		int sum = 0;
		while(n>0) {
			int ld = n%10;
			if(ld == 2 || ld == 3 || ld == 5|| ld == 7) {
				sum = sum+ld;
			}
			n = n/10;
		}
		return sum;
	}
//	static boolean isPrime(int n) {
//		if(n<=1) {
//			return false;
//		}
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
}
//wap to define a method to print sum of prime digits present in the number 
