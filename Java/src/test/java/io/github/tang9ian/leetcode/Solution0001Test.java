package io.github.tang9ian.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution0001Test {
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
