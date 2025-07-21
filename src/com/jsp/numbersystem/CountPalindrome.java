package com.jsp.numbersystem;

public class CountPalindrome {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=1000;i++){
            if (isPalindrome(i)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isPalindrome(int n){
        int dup = n;
        int rev = 0;
        while (n>0){
            int ld = n%10;
            rev = rev*10+ld;
            n =n/10;
        }
        return rev == dup;
    }


}
