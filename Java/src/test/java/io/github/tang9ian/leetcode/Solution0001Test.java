package io.github.tang9ian.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution0001Test {

    /**
     * 1. Two Sum Given an array of integers nums and an integer target, return
     * indices of the two numbers such that they add up to target. You may assume
     * that each input would have exactly one solution, and you may not use the same
     * element twice. You can return the answer in any order.
     * 
     * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
     * Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2: Input: nums = [3,2,4], target = 6 Output: [1,2]
     * 
     * Example 3: Input: nums = [3,3], target = 6 Output: [0,1]
     */

    private final Solution0001 s0001 = new Solution0001();

    @Test
    void twoSum() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, s0001.twoSum(nums, target));

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] expected2 = { 1, 2 };
        assertArrayEquals(expected2, s0001.twoSum(nums2, target2));

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] expected3 = { 0, 1 };
        assertArrayEquals(expected3, s0001.twoSum(nums3, target3));
    }

    @Test
    void twoSum2() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, s0001.twoSum2(nums, target));

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] expected2 = { 1, 2 };
        assertArrayEquals(expected2, s0001.twoSum2(nums2, target2));

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] expected3 = { 0, 1 };
        assertArrayEquals(expected3, s0001.twoSum2(nums3, target3));
    }

    @Test
    void twoSum3() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, s0001.twoSum3(nums, target));

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] expected2 = { 1, 2 };
        assertArrayEquals(expected2, s0001.twoSum3(nums2, target2));

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] expected3 = { 0, 1 };
        assertArrayEquals(expected3, s0001.twoSum3(nums3, target3));
    }
}
