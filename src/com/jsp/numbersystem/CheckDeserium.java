package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckDeserium {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to check if it is deserium or not : ");
        int n = scn.nextInt();
        if(isDisarium(n)){
            System.out.println("The number is deserium");
        }
        else {
            System.out.println("The number is not deserium");
        }
    }
    static boolean isDisarium(int n){
        int count = countDigits(n);
        int temp = n;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            int pow = findPow(ld,count);
            sum = sum+pow;
            count--;
            n = n/10;
        }
        return temp==sum;
    }
    static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    static int findPow(int n,int p){
        int res = 1;
        for(int i=0;i<p;i++){
            res = res*n;
        }
        return res;
    }



}
