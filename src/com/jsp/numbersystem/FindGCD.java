package com.jsp.numbersystem;
import java.util.*;

public class FindGCD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int x = scn.nextInt();
		System.out.print("Enter Second number : ");
		int y = scn.nextInt();
		int gcd = GreatestCD(x,y);
		System.out.println("The greatest commonn divisior is : "+gcd);
	}
	public static int GreatestCD(int x, int y) {
		int gcd = 0;
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
//wap to define a method to find the gcd of given two numbers