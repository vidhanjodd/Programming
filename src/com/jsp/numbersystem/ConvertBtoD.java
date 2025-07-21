package com.jsp.numbersystem;

import java.util.Scanner;

public class ConvertBtoD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the binary value : ");
        int n = scn.nextInt();
        int res = convertBtoD(n);
        System.out.println("The decimal value is "+res);
    }
    static int convertBtoD(int n){
        int res = 0;
        int base = 1;
        while(n>0){
            int ld = n%10;
            res = res+ld*base;
            n =n/10;
            base = base*2;
        }
        return res;
    }

}
