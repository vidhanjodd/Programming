//write a program to define a method to check the given number is prime number or not 
package com.jsp.numbersystem;
import java.util.*;
public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not : ");
		int n = scn.nextInt();
		boolean isPrime = CheckPrime(n);
		if(isPrime) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		scn.close();	}
	 static boolean CheckPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
