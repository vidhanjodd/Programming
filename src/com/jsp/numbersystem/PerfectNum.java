package com.jsp.numbersystem;

import java.util.Scanner;

public class PerfectNum {
	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int n = scn.nextInt();
			boolean isPerfect =  PerfectNO(n);
			scn.close();
			if(isPerfect) {
				System.out.println(n+" is a perfect number");
			}
			else {
				System.out.println(n+" is not a perfect number");
			}
	 }
	 public static boolean PerfectNO(int n) {
		 int sum = 0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum+=i;;
				}
			}
			if(sum == n) {
//				System.out.println(n+" is a perfect number");
				return true;
			}
			else {
//				System.out.println(n+" is not a perfect number");
				return false;
			}
	 }
}
