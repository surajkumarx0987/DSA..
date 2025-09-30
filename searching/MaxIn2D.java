package com.searching;

import java.util.Arrays;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr  = {{2,3,4,5},{7,8,9},{7,65,8}};

        System.out.println(search(arr));

    }
    private static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int Num : row){
                if(Num>max){
                    max = Num;
                }
            }
        }
        return max;
    }
}
