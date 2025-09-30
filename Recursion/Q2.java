package com.Recursion;
//using back tracking
/*  Function call flow
Start with printNumbers(5).
Since n < 1, it calls print(4).
print(4) calls print(3), and so on…
Finally, print(2) calls printN(1).

Base case

When n < 1, the function just returns.

This stops further recursion and begins the backtracking phase.

Backtracking phase (unwinding)

After returning from print(1), the next statement is System.out.print(n + " ");.

Now each waiting call prints its own n:
print(1) prints 1
print(2) prints 2
print(3) prints 3
print(4) prints 4
print(5) prints 5
Final Output
1 2 3 4 5
    --> printNumbers(5)
    |
    --> printNumbers(4)
            |
            --> printNumbers(3)
                    |
                    --> printNumbers(2)
                            |
                            --> printNumbers(1)
                                    |
                                    --> printNumbers(0)  [stop]
                                    print 1
                            print 2
                    print 3
            print 4
    print 5
*/
public class Q2 {
    public static void main(String[] args) {
        print(5);
        prints(1);
    }
    static void print(int n){

        if(n<1){
            return;
        }
        print((n-1));
        System.out.println(n);

    }
    static void prints(int n){
        if(n>5){
            return;
        }
        prints(n+1);
        System.out.println(n);
    }

}
