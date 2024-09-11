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
	}
	
	@Test
	void twoSum2() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] expected = { 0, 1 };
		assertArrayEquals(expected, s0001.twoSum2(nums, target));
	}
}
