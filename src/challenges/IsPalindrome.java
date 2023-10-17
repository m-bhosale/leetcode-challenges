package challenges;

/*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        if (s.length() <= 1) {
            return true;
        }

        boolean flag = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean output = isPalindrome(input);
        System.out.println("Output: " + output);
    }

}
