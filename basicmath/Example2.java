package com.basicmath;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));


    }
    private static int ans(int[] num){
        int unique = 0;
        for(int i=0; i<num.length; i++){
            unique ^= num[i];

        }
        return unique;
    }
}
