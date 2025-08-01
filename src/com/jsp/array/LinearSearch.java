package com.jsp.array;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int target = 30;
        int res = lsearch(arr,target);
        if(res<0){
            System.out.println("The target is not in the array");
        }
        else{
            System.out.println("The target is found on the index : "+res);
        }
    }
    static int lsearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
