package com.jsp.numbersystem;

import java.util.Scanner;

public class FirstNthPrimeNumber
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n  = scn.nextInt();
        int res = nThPrime(n);
        System.out.println("The "+n+" Prime number is : "+res);
    }
    static int nThPrime(int n){
        int count = 0;
        int i = 2;
        int nth = 0;
        while(count!=n){

            if(isPrime(i)){
                count++;
                nth = i;
            }
            i++;
        }
        return nth;
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
