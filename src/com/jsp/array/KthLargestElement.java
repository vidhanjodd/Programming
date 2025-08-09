package com.jsp.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[] = { 10, 20, 10, 30, 20, 50, 10 };
        int[] b = removeDuplicate(a);
        System.out.print("Enter the value for k : ");
        int n  = scn.nextInt();
        if(n>b.length){
            System.out.println("Enter the valid value ");
        }
        else
            System.out.println("The element is : "+b[b.length - n]);
    }
    static int[] removeDuplicate(int[] a){
        HashSet<Integer> hs  = new HashSet<Integer>();
        for(int i :a){
            hs.add(i);
        }
        int b[] = new int[hs.size()];
        int index = 0;
        for(int ele : hs){
            b[index] = ele;
            index++;
        }
        Arrays.sort(b);
        return  b;
    }
}
