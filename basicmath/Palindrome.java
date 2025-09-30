package com.basicmath;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(ans(num));

    }
    private static boolean ans(int num){
        int reverseNumber = 0;
        int duplicate = num; //**
        while(num>0){
            int digit = num % 10;
            num /= 10;
            reverseNumber = (reverseNumber*10) + digit;
        }
        return (duplicate == reverseNumber);
    }
}
