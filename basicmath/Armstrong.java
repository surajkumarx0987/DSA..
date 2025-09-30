package com.basicmath;

import java.util.Scanner;

import static java.lang.Math.log10;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = (int)(log10(num)+1);
        System.out.println(ans(num ,n));

    }
    private static boolean ans(int num,int n) {
        int sum = 0;
        int duplicate = num;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (int)(Math.pow(digit,n));
            num /= 10;
        }
        return (sum==duplicate);
    }
}
