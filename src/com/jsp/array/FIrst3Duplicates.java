package com.jsp.array;

public class FIrst3Duplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,20,30,40,40,50,10,10};
        boolean b[] = new boolean[arr.length];
        int n= 0;
        for(int i=0;i<arr.length;i++){
            if (!b[i]){
                int count = 0;
                b[i] = true;
                for(int j=0;j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                        b[j] = true;
                    }
                }
                if(count>1 && n<3){
                    System.out.println("Number : " + arr[i] + " Occurence : " + count);
                    n++;
                }
               }
            }

        }
    }
