package challenges;

import java.util.Arrays;

/*
    You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
    There are at least two different characters in letters.

    Return the smallest character in letters that is lexicographically greater than target.
    If such a character does not exist, return the first character in letters.
 */
public class NextGreatestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];

        Arrays.sort(letters);
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j' };
        char target = 'a';

        char output = nextGreatestLetter(letters, target);
        System.out.println("Output : " + output);
    }

}
