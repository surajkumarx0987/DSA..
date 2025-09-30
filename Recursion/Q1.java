package com.Recursion;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        print(1);
        prints(1);
        printss(5);

    }
    // print name 5 times  TC-> O(N)  , SC-> O(N)
    private static void print(int n){
        System.out.println("suraj");
        if (n==5){
            return;
        }
        print(n+1);
    }
    // print linearly from 1 to n
    private static void prints(int n){
        System.out.println(n);
        if(n==5){
            return;
        }
        prints(n+1);

    }
    // print from n to 1
    static void printss(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        printss(n-1);

    }
}
