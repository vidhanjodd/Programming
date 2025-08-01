package com.jsp.array;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,20};
        boolean counted[] = new boolean[arr.length];
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
                System.out.println("Number : " + arr[i] + " Occurence : " + count);
            }

            }
        }
    }
