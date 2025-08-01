package com.jsp.array;

public class MissingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,8};
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int i=min+1;i<max;i++){
            if(isMissing(arr,i)){
                System.out.println(i);
            }
        }
    }
    static boolean isMissing(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                return false;
            }
        }
        return true;
    }

}
