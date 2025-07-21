package com.jsp.numbersystem;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
