package com.revature.Practice;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum =  target - nums[i];
            if (indexMap.containsKey(requiredNum)) {
                return new int[]{indexMap.get(requiredNum), i};
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}

public class LeetCode{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{3, 2, 3}, 6)));
    }
}
