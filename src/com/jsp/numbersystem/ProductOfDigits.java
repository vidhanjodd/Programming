package com.jsp.numbersystem;
import java.util.*;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = scn.nextInt();
		int product = productOfDigit(n);
		System.out.println("The product is : "+product);
		scn.close();
	}
	static int productOfDigit(int n) {
		int product = 1;
		while(n>0) {
			int ld = n%10;
			if(ld!=0)
				product = product*ld;
			n = n/10;
		}
		return product;
	}
}
//wap to define the method to print product of each digit present in the number 
