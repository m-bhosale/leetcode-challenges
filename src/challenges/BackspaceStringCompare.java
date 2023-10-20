package challenges;

/*
    Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
    Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        String str1 = "";
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (str1.length() > 0)
                    str1 = str1.substring(0, str1.length() - 1);

            } else {
                str1 = str1 + ch;
            }
        }

        String str2 = "";
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (str2.length() > 0)
                    str2 = str2.substring(0, str2.length() - 1);
            } else {
                str2 = str2 + ch;
            }
        }

        return str1.equals(str2);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean output = backspaceCompare(s, t);
        System.out.println("Output : " + output);
    }

}
