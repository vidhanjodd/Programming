package com.jsp.numbersystem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        if (n<1){
            System.out.println("Enter the posivite integer");
            return;
        }
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
