package string.iterative;

public class Palindrome {

    /*
        Case sensitive
    */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("SAGAS"));
        System.out.println(Palindrome.isPalindrome("ABBCA"));
    }

}
