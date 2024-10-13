package io.github.tang9ian.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution0001 {

    // O(n^2) - Brute Force
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null; // Return if no solution is found
    }

    // O(n) - Hashmap
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return null; // Return if no solution is found
    }

    // O(n) - Two-pointer
    public int[] twoSum3(int[] nums, int target) {
        // Pair each number with its index
        int[][] numsWithIndices = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            numsWithIndices[i][0] = nums[i]; // value
            numsWithIndices[i][1] = i; // index
        }

        // Sort based on the values (i.e., the first element in each pair)
        Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));

        int low = 0, high = numsWithIndices.length - 1;

        while (low < high) {
            int sum = numsWithIndices[low][0] + numsWithIndices[high][0];
            // System.out.println("nums[" + low + "] + nums[" + high + "] = " + sum);

            if (sum == target) {
                // Return the original indices
                return new int[] { numsWithIndices[low][1], numsWithIndices[high][1] };
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }

        return null; // Return if no solution is found
    }

}
