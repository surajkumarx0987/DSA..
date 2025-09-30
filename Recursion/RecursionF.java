package com.Recursion;

public class RecursionF {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        System.out.println(n);
        if(n==5){     // base condition
            return;
        }
        //this is called tail recursion
        print(n+1);
    }
}


