package com.searching;
import java.util.Arrays;
public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr  = {{2,3,4,5},{7,8,9},{7,65,8}};
        int target = 65;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    private static int[] search(int[][] arr,int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int element = arr[i][j];
                if(element==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    }

