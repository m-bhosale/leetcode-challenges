package challenges;

import java.util.Arrays;

//  The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
//  For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
//  Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
//  Return the maximum such product difference.
public class MaxProductDifference {

    public static int maxProductDifference(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        return (nums[nums.length - 2] * nums[nums.length - 1]) - (nums[0] * nums[1]);
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        int output = maxProductDifference(nums);
        System.out.println("Output : " + output);
    }

}
