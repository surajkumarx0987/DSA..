package com.searching;

public class MinimumNo {
    public static void main(String[] args) {
        int[] arr  = {3,9,23,7,5,3,8};
        System.out.println(search(arr));
    }
    private static int search(int[] arr){
        int Min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }
        return Min;
    }
}
