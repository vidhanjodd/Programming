package com.jsp.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j>0;j--) {
                System.out.print((char)(j+96)+" ");

            }
            System.out.println();
        }
    }
}
