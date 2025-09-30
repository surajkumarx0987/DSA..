package com.Recursion;
/* sum(5)
= 5 + sum(4)
          |
          --> sum(4)
              = 4 + sum(3)
                        |
                        --> sum(3)
                            = 3 + sum(2)
                                      |
                                      --> sum(2)
                                          = 2 + sum(1)
                                                    |
                                                    --> sum(1)
                                                        = 1 + sum(0)
                                                                  |
                                                                  --> sum(0) = 0
    */

public class Q3 {
    public static void main(String[] args) {

        System.out.println(sum(5));
        System.out.println(fact(5));
    }
    private static int sum(int n){
        if(n==0) {
            return 0;
        }
        return n + sum(n-1);
    }
    private static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }


}
