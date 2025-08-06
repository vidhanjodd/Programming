package com.jsp.array;

import java.util.Scanner;

public class SortArrayASC {
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scn.nextInt();
        int []arr = new int[n];
        System.out.println("Now enter the values");
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" value : ");
            arr[i] = scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int  temp = arr[i];
                if(arr[i]>arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
