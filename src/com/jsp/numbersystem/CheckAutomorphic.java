package com.jsp.numbersystem;

import java.util.Scanner;

public class CheckAutomorphic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is automorphic is not : ");
        int n = scn.nextInt();
        if(isAutomorphic(n)){
            System.out.println("the number is automorphic");
        }
        else {
            System.out.println("the number is not automorphic");
        }
    }
    static boolean isAutomorphic(int n){
        int sq = n*n;
        while(n>0){
            int ld = n%10;
            int sld = sq%10;
            if(ld!=sld){
                return false;
            }
            n =n/10;
            sq = sq/10;
        }
        return true;
    }

}
