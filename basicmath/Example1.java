package com.basicmath;

public class Example1 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(IsOdd(num));
    }
    static boolean IsOdd(int num){
        return (num & 1) == 1;
    }

}
