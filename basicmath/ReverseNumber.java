package com.basicmath;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 5678;
        System.out.println(ans(num));
    }
    private static int ans(int num){
        int reverseNo = 0;
        while (num>0){
            int digit = num % 10;
            num /= 10;
            reverseNo = (reverseNo*10) + digit;
        }
        return reverseNo;
    }
}
