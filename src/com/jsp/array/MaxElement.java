package com.jsp.array;

public class MaxElement {
    public static void main(String[] args) {
        int [] arr = {10,45,67,32};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }

        }
        System.out.println(max);
    }
}
