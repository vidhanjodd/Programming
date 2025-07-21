package com.jsp.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.printf("%3d",n);
                n++;
            }
            System.out.println();
        }
    }
}
