package maths.recursive;

import utils.constants.Test;

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
 */
public class Factorial {
    public long factorial (int n) {
        if (n == 0) {
            return(1);
        }
        return(n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(6));
    }
}