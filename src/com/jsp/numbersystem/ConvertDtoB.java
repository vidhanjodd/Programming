package com.jsp.numbersystem;

import java.util.Scanner;

public class ConvertDtoB
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int n = scn.nextInt();
        String res = convertDtoB(n);
        System.out.println("The binary value is "+res);
    }
    static String  convertDtoB(int n){
        String n1 = "";
        while(n>0) {
            int num = n % 2;
            n1 = num+n1;
            n = n / 2;
        }
        return n1;
    }

}
