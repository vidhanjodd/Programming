package com.jsp.array;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 20, 30};
        int[] res = mergeArray(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    static int[] mergeArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int res[] = new int[n+m];
        for(int i=0;i<n;i++){
            res[i] = arr1[i];
        }
        for(int i=0;i<m;i++){
            res[n+i] = arr2[i];
        }
        return res;
    }
}
