package com.searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr  = {3,9,23,0,7,5,3,8};
        int target = 7;
        System.out.println(search(arr,target,2,6));
    }
    private static int search(int[] num,int target,int start,int end){
        if(num.length==0){
            return -1;
        }
        for(int i=start; i<end; i++){
            int element = num[i];
            if(element == target){
                return i;
            }

        }
        return -1;
    }

}
