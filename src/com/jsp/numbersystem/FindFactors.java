package com.jsp.numbersystem;
import java.util.*;

public class FindFactors {
   public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("Enther a number : ");
	int n = scn.nextInt();
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			System.out.println(i);
		}
	}
	System.out.println(n);
	scn.close();	
}
}
