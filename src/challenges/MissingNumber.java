package challenges;

import java.util.Arrays;

/*
    Given an array nums containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }

        if (nums[0] > 0) {
            return nums[0] - 1;
        }

        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int output = missingNumber(nums);
        System.out.println("Output : " + output);
    }

}
