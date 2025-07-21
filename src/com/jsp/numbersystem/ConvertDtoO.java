package com.jsp.numbersystem;

import java.util.Scanner;

public class ConvertDtoO {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int n = scn.nextInt();
        String res = convertDtoO(n);
        System.out.println("The binary value is "+res);
    }
    public static String convertDtoO(int n){
        String res = "";
        while(n>0){
            int ld = n%8;
            res = ld+res;
            n = n/8;
        }
        return res;
    }

}
