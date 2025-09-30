package com.basicmath;

public class GCD {
    public static void main(String[] args) {
        int N1 = 4;
        int N2 = 2;
        System.out.println(hcf(N1,N2));
    }
    private static int hcf(int N1,int N2){
        /*for(int i=Math.min(N1,N2); i>=1; i--){
            if(N1%i==0 && N2%i==0){
                System.out.println(i);
                break;
            }
        } */
        while(N1>0 && N2>0){
            if(N1>N2){
                N1=N1%N2;
            } else{
                N2=N2%N1;
            }

        }
        if(N1==0){
            return N2;
        } else{
            return N1;
        }
    }
}
