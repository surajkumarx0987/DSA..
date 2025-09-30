package com.basicmath;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println((a*b)/ans(a,b));
    }
    private static int ans(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }

        }
        if(a==0){
            return b;
        }else{
            return a;
        }

    }

}
