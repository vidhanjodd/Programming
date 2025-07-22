package com.jsp.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int x=1;
        for(int i=0;i<5;i++){
            for(int j=1;j<=5;j++) {
                System.out.print((i+j)%2+" ");

            }
            System.out.println();
        }
    }
}
