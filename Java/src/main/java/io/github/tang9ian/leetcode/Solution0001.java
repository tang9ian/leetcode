package io.github.tang9ian.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution0001 {
	// O(n^2)
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
	
	// O(n)
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> d = new HashMap<>();
		for (int i = 0;; i++) {
			int x = nums [i];
			int y = target - x;
			if(d.containsKey(y)) {
				return new int[] {d.get(y), i };
			}
			d.put(x, i);
		}
	}
}
