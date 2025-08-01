package com.jsp.array;

public class FIrst3Duplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,20,30,40,40,50,10,10};
        boolean counted[] = new boolean[arr.length];
        int n= 3;
        for(int i=0;i<arr.length;i++){
            if (!counted[i]){
                int count = 0;
                counted[i] = true;
                for(int j=0;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                        counted[j] = true;
                    }
                }
                if(count>1 && n>0){
                    System.out.println("Number : " + arr[i] + " Occurence : " + count);
                    n--;
                }
               }
            }

        }
    }
