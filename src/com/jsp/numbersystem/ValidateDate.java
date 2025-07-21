package com.jsp.numbersystem;
import java.util.*;

public class ValidateDate {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the day : ");
		int d = scn.nextInt();
		System.out.print("Enter the Month : ");
		int m = scn.nextInt();
		System.out.print("Enter the year : ");
		int y = scn.nextInt();
		if(d<1 || d>31 || m<1 || m>12|| y < 1) {
			System.out.println("Invalid date");
		}
		else if((m == 4 || m == 6 || m == 9 || m == 11) && d>30) {
			System.out.println("Invalid date");
		}
		else if(!(y%4==0 && y%100 != 0 || y%400 == 0) && m == 2 && d >28) {
			System.out.println("Invalid date");
		}
		else if((y%4==0 && y%100 != 0 || y%400 == 0) && m == 2 && d>29) {
			System.out.println("Invalid Date");
		}
		else {
			System.out.println("Valid date");
		}
		scn.close();
	}
}
