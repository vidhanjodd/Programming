package com.jsp.numbersystem;

import java.util.Scanner;

public class ConvertDtoH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int n = scn.nextInt();
        String res = convertDtoH(n);
        System.out.println("The hexadecimal value is "+res);
    }
    public static String convertDtoH(int n){
        String rem = "";
        while(n>0) {
            int ld = n % 16;
            if(ld>9){
                rem = (char)(ld+55)+rem;
            }
            else
                rem = ld + rem;
            n = n / 16;
        }
        return rem;
    }


}
