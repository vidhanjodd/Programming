package com.jsp.numbersystem;

import java.util.Scanner;

public class SmallestUsingTernary
{
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a = scn.nextInt();
        System.out.print("Enter the first number ");
        int b = scn.nextInt();
        System.out.print("Enter the first number ");
        int c = scn.nextInt();
        System.out.println("The Smallest number is : "+(a<b?(a<c?a:c):(b<c?b:c)));

    }
}
