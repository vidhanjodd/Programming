package com.jsp.numbersystem;
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong or not : ");
        int n = scn.nextInt();
        if(isArmStrong(n)) {
            System.out.println("The number is armstrong....");
        }
        else {
            System.out.println("The number is not armstrong....");
        }
        scn.close();
    }
    static boolean isArmStrong(int n){
        int count = noOfDigits(n);
        int temp = n;
        int sum = 0;
        while(n>0){
            int pow = pow(n%10,count);
            sum = sum+pow;
            n =n/10;
        }
        return temp == sum;
    }
    static int noOfDigits(int n){
        int cnt  = 0;
        while(n>0){
            cnt++;
            n = n/10;
        }
        return cnt;
    }
    static int pow(int ld,int count){
           int ans = 1;
        for(int i=0;i<count;i++){
            ans = ans*ld;
        }
        return ans;
//        if(count == 1) return ld;
//        return ld*pow(ld,--count);

    }



}
