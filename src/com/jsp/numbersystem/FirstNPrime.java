package com.jsp.numbersystem;

import java.util.Scanner;

public class FirstNPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();
        int count = 0;
        int i=2;
        while(count<n){
           if(isPrime(i)){
               System.out.println(i);
               count++;
           }
           i++;
        }

    }
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
