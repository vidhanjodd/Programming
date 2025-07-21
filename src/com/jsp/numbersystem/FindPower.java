package com.jsp.numbersystem;
import java.util.*;
public class FindPower {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		System.out.print("Enther the Power : ");
		int p = scn.nextInt();
		int res = Power(n,p);
		System.out.println("The Result is : "+res);
		scn.close();
	}
	static int Power(int n,int p) {
		
		int res = 1;
		
		for(int i=1;i<=p;i++) {
			res = res*n;
		}
		return res;
	}
	
}
//wap to define a method to find n to the power of p ;
