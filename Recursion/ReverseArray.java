package com.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8};
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr,int s,int e){

        int temp = 0;
        if(s>=e){
            return;
        }
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            reverse(arr, s + 1, e - 1);



    }
}
