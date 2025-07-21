package com.jsp.numbersystem;

import java.util.Scanner;

public class FactorsSum {
	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int n = scn.nextInt();
			int sum = 0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum+=i;;
				}
			}
			sum = sum+n;
			System.out.println(sum);
			scn.close();
	 }
}
