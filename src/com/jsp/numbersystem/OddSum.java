package com.jsp.numbersystem;

public class OddSum {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		for(int i=1;i<=50;i+=2) {
				sum+=i;
			
		}
		for(int i=1;i<=50;i++) {
			if(i%2!=0) {
				sum1+=i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum);
	}
}
