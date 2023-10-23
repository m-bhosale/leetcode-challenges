package challenges;

/*
    Given an integer n, return true if it is a power of four. Otherwise, return false.
    An integer n is a power of four, if there exists an integer x such that n == 4x.
 */
public class PowerOfFour {

    // TODO: Try to solve without loop and recursion
    public static boolean isPowerOfFour(int n) {

        if (n <= 0) return false;

        if (n == 1) return true;

        while (n > 1) {
            if (n % 4 != 0) return false;
            n = n / 4;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean output = isPowerOfFour(64);
        System.out.println("Output : " + output);
    }

}
