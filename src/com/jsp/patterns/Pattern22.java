package com.jsp.patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;
        int x=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("    ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%4d",x);
                x++;
            }
            System.out.println();
        }
    }
}
