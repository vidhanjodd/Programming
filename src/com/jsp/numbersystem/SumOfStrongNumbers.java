package com.jsp.numbersystem;

import java.util.Scanner;

class SumOfStrongNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(strongNumber(i)){
                sum+=i;
            }
        }
        System.out.println("sum is : "+sum);
    }
    static boolean strongNumber(int n){
        int dup = n;
        int sum = 0;
        while(n>0) {
            int ld = n%10;
            int fac = 1;
            for(int i=1;i<=ld;i++) {
                fac = fac*i;
            }
            sum += fac;
            n =n/10;
        }
        return dup == sum;
    }

}
// wap to find the sum of all strong numbers present between 1 and n
