package com.jsp.numbersystem;
import java.util.*;



public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.print("enter a year : ");
        int year  = scn.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year%400 == 0 ){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        scn.close();
	}
	
}
