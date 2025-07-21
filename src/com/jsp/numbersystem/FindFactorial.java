package com.jsp.numbersystem;
import java.util.*;
public class FindFactorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to find factorial : ");
		int n = scn.nextInt();
		int fact = Factorial(n);
		System.out.println("the factorial of "+n+" is : "+fact);
		scn.close();
		
	}
	static int Factorial(int n) {
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
// wap to find factorial of the number