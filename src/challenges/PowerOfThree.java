package challenges;

/*
    Given an integer n, return true if it is a power of three. Otherwise, return false.
    An integer n is a power of three, if there exists an integer x such that n == 3x.
 */
public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public static void main(String[] args) {
        boolean output = isPowerOfThree(27);
        System.out.println("Output : " + output);
    }

}
