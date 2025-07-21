package com.jsp.numbersystem;

import java.util.Scanner;

public class NearestPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to find its nearest prime number : ");
        int n = scn.nextInt();
        int res = nearestPrime(n);
        System.out.println("The nearest prime number is : "+res);
    }
    static int nearestPrime(int n){
        int l = n;
        int r = n;
        if(isPrime(n)){
            return n;
        }
        while(true){
            if(isPrime(--l)){
                return l;
            }
//            l--;
            if(isPrime(++r)){
                return r;
            }
//            r++;
        }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


}
