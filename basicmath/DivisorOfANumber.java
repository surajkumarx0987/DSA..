package com.basicmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DivisorOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ans(num);
    }
     static void ans(int num){
        List<Integer> divisor = new ArrayList<>();
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                divisor.add(i);//first divisor
                if(i != num/i){
                    divisor.add(num/i);//avoid duplicate
                }
            }

        }
         Collections.sort(divisor);
         System.out.println(divisor);

    }
}
