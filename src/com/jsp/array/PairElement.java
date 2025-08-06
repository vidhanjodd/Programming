package com.jsp.array;

public class PairElement {
        public static void main(String[] args) {
            int []arr = {1,2,0,5,3,9,4,5,6};
            int target = 6;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if (arr[i] + arr[j] == target) {
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
        }
}
