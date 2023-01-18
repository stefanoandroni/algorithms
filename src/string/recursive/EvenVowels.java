package string.recursive;

import utils.constants.Test;

/*
    method: divide and conquer
*/
public class EvenVowels {

    public static boolean isVowelsNumberEven(String s) {
        return isVowelsNumberEven(s, 0, s.length() - 1);
    }

    private static boolean isVowelsNumberEven(String s, int sx, int dx) {
        // base case: one character
        if (sx == dx) {
            if (isVowels(s.charAt(sx))) {
                return false; // if it's a vowel, the number of vowels is odd
            } else {
                return true; // if it's not a vowel, the number of vowels is even
            }
        }
        int m = (sx + dx) / 2; // find middle index
        boolean r1 = isVowelsNumberEven(s, sx, m); // recursively call method for substring before middle index inclusive
        boolean r2 = isVowelsNumberEven(s, m + 1, dx); // recursively call method for substring after middle index

        // check if results of recursive calls are equal
        if (r1 == r2) { // even + even = even // odd + odd = even
            return true; // if they are, the number of vowels in the entire string is even
        } else {
            return false; // if they aren't, the number of vowels in the entire string is odd
        }
    }

    private static boolean isVowels(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(EvenVowels.isVowelsNumberEven(Test.SEvenVowels));
        System.out.println(EvenVowels.isVowelsNumberEven(Test.SOddVowels));

    }
}
