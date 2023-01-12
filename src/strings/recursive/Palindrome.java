package strings.recursive;


public class Palindrome {
    /*
        Case sensitive
    */
    public boolean isPalindrome(String s) {
        return isPalindromeRecursive(s, 0, s.length() - 1);
    }

    private boolean isPalindromeRecursive(String s, int sx, int dx) {
        if (dx <= sx) {
            return (true);
        }

        if (s.charAt(sx) == s.charAt(dx)) {
            return isPalindromeRecursive(s, sx + 1, dx - 1);
        } else {
            return (false);
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("SAGAS"));
        System.out.println(palindrome.isPalindrome("ABBCA"));
    }
}
