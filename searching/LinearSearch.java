package com.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,9,0,1,2,5};
        int target = 2;

        System.out.println(search(arr,target));

    }
    static int search(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
