package com.basicmath;

import static java.lang.Math.log10;

public class CountDigits {
    public static void main(String[] args) {
        int num = 3450;
       // int cnt = (int)(log10(num) + 1); -> we can also use this for calculating number of digits
       //TC -> O(log10(n))
        System.out.println( ans(num));
    }
    private static int ans(int num){
        int count = 0;
        while(num>0){
            int digits = num % 10;
            num /= 10;
            count++;
        }
        return count;
    }
}
