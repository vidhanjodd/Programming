package com.jsp.array;

public class MinElement {
    public static void main(String[] args) {
        int [] arr = {10,23,45,67,32,9};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
            }
        }
        System.out.println(min);
    }
}
